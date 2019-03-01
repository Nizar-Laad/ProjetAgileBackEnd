package com.example.demo.MainApplication.Controller;

import com.example.demo.MainApplication.Exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import com.example.demo.MainApplication.DAO.EnseignantEntity;
import com.example.demo.MainApplication.Repository.EnseignantRepository;


import java.util.List;

@RestController
@RequestMapping("/projetagile")
public class EnseignantController {


    @Autowired
    EnseignantRepository enseignantRepository;

    // Get All Enseignants
    @GetMapping("/enseignants")
    public List<EnseignantEntity> getAllEnseignants() {
        return enseignantRepository.findAll();
    }


    // Create a new Enseignant
    @PostMapping("/enseignants")
    public EnseignantEntity createEnseignant(@Valid @RequestBody EnseignantEntity enseignant) {
        return enseignantRepository.save(enseignant);
    }

    // Get a Single Enseignant
    @GetMapping("/enseignants/{id}")
    public EnseignantEntity getEnseignantById(@PathVariable(value = "id") Integer enseignantId) {
        return enseignantRepository.findById(enseignantId)
                .orElseThrow(() -> new ResourceNotFoundException("Enseignant", "id", enseignantId));
    }

    @GetMapping("/enseignants/nom/{nom}")
    public List<EnseignantEntity> getEnseignantByName(@PathVariable(value = "nom") String enseignantName) {
        return enseignantRepository.findByNom(enseignantName);
        //.orElseThrow(() -> new ResourceNotFoundException("Candidat", "nom", candidatName));
    }

    @GetMapping("/enseignants/emailUbo/{emailUbo}")
    public List<EnseignantEntity> getEnseignantByEmailUbo(@PathVariable(value = "emailUbo") String enseignantEmailUbo) {
        return enseignantRepository.findByEmailUbo(enseignantEmailUbo);
        //.orElseThrow(() -> new ResourceNotFoundException("Candidat", "universite", candidatUniversite);
    }

    // Delete a Enseignant
    @DeleteMapping("/enseignant/{id}")
    public ResponseEntity<?> deleteEnseignant(@PathVariable(value = "id") Integer enseignantId) {
        EnseignantEntity enseignant = enseignantRepository.findById(enseignantId)
                .orElseThrow(() -> new ResourceNotFoundException("Enseignant", "id", enseignantId));

        enseignantRepository.delete(enseignant);

        return ResponseEntity.ok().build();


    }

    @DeleteMapping("/enseignants")
    public ResponseEntity<?> deleteEnseignants() {

        enseignantRepository.deleteAll();

        return ResponseEntity.ok().build();


    }
}