package com.example.demo.MainApplication.Controller;

import com.example.demo.MainApplication.Exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import com.example.demo.MainApplication.DAO.PromotionEntity;
import com.example.demo.MainApplication.Repository.PromotionRepository;
import com.example.demo.MainApplication.DAO.PromotionEntityPK;

import java.util.List;

@RestController
@RequestMapping("/projetagile")
public class PromotionController {


    @Autowired
    PromotionRepository promotionRepository;

    // Get All Promotions
    @GetMapping("/promotions")
    public List<PromotionEntity> getAllPromotions() {
        return promotionRepository.findAll();
    }


    // Create a new Promotion
    @PostMapping("/promotions")
    public PromotionEntity createPromotion(@Valid @RequestBody PromotionEntity promotion) {
        return promotionRepository.save(promotion);
    }

    // Get a Single Promotion
    @GetMapping("/promotions/{codeFormation}/{anneeUniversitaire}")
    public PromotionEntity getPromotionById(@PathVariable(value = "codeFormation") String codeFormation,@PathVariable(value = "anneeUniversitaire") String anneeUniversitaire) {
        PromotionEntityPK pk = new PromotionEntityPK();
        pk.setAnneeUniversitaire(anneeUniversitaire);
        pk.setCodeFormation(codeFormation);
        return promotionRepository.findById(pk)
                .orElseThrow(() -> new ResourceNotFoundException("Promotion", "id",pk ));
    }

    @GetMapping("/promotions/sigle/{siglePromotion}")
    public List<PromotionEntity> getPromotionBySigle(@PathVariable(value = "siglePromotion") String siglePromotion) {
        return promotionRepository.findBySiglePromotion(siglePromotion);
        //.orElseThrow(() -> new ResourceNotFoundException("Formation", "nom", formationName));
    }


    // Delete a Promotion
    @DeleteMapping("/promotions/{codeFormation}/{anneeUniversitaire}")
    public ResponseEntity<?> deletePromotion(@PathVariable(value = "codeFormation") String codeFormation,@PathVariable(value = "anneeUniversitaire") String anneeUniversitaire) {
        PromotionEntityPK pk = new PromotionEntityPK();
        pk.setAnneeUniversitaire(anneeUniversitaire);
        pk.setCodeFormation(codeFormation);
        PromotionEntity promotion= promotionRepository.findById(pk)
                .orElseThrow(() -> new ResourceNotFoundException("Promotion", "id",pk ));

        promotionRepository.delete(promotion);

        return ResponseEntity.ok().build();


    }
    @DeleteMapping("/promotions")
    public ResponseEntity<?> deletePromotion() {

        promotionRepository.deleteAll();

        return ResponseEntity.ok().build();


    }


}