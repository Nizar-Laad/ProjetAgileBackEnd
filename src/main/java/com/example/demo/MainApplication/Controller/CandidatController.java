package com.example.demo.MainApplication.Controller;

import com.example.demo.MainApplication.Exception.ResourceNotFoundException;
import com.example.demo.MainApplication.Repository.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import com.example.demo.MainApplication.DAO.CandidatEntity;


import java.util.List;

@RestController
@RequestMapping("/projetagile")
public class CandidatController {

    @Autowired
    CandidatRepository candidatRepository;



    // Get All Candidats
    @GetMapping("/candidats")
    public List<CandidatEntity> getAllCandidats() {
        return candidatRepository.findAll();
    }


    // Create a new Candidat
    @PostMapping("/candidats")
    public CandidatEntity createCandidat(@Valid @RequestBody CandidatEntity candidat) {
        return candidatRepository.save(candidat);
    }

    // Get a Single Candidat
    @GetMapping("/candidats/{id}")
    public CandidatEntity getCandidatById(@PathVariable(value = "id") String candidatId) {
        return candidatRepository.findById(candidatId)
                .orElseThrow(() -> new ResourceNotFoundException("Candidat", "id", candidatId));
    }

    @GetMapping("/candidats/nom/{nom}")
    public List<CandidatEntity> getCandidatByName(@PathVariable(value = "nom") String candidatName) {
        return candidatRepository.findByNom(candidatName);
        //.orElseThrow(() -> new ResourceNotFoundException("Candidat", "nom", candidatName));
    }
    @GetMapping("/candidats/universite/{universite}")
    public List<CandidatEntity> getCandidatByUniversity(@PathVariable(value = "universite") String candidatUniversite) {
        return candidatRepository.findByUniversiteOrigine(candidatUniversite);
        //.orElseThrow(() -> new ResourceNotFoundException("Candidat", "universite", candidatUniversite);
    }

    // Delete a Candidat
    @DeleteMapping("/candidat/{id}")
    public ResponseEntity<?> deleteCandidat(@PathVariable(value = "id") String candidatId) {
        CandidatEntity candidat = candidatRepository.findById(candidatId)
                .orElseThrow(() -> new ResourceNotFoundException("Candidat", "id", candidatId));

        candidatRepository.delete(candidat);

        return ResponseEntity.ok().build();


    }
    @DeleteMapping("/candidats")
    public ResponseEntity<?> deleteCandidats() {

        candidatRepository.deleteAll();

        return ResponseEntity.ok().build();


    }}