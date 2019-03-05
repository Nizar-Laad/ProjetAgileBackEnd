<<<<<<< HEAD
package com.example.demo.MainApplication.Controller;

import com.example.demo.MainApplication.Exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import com.example.demo.MainApplication.DAO.FormationEntity;
import com.example.demo.MainApplication.Repository.FormationRepository;

import java.util.List;

@RestController
@RequestMapping("/projetagile")
public class FormationController {


    @Autowired
    FormationRepository formationRepository;

    // Get All Formations
    @GetMapping("/formations")
    public List<FormationEntity> getAllFormations() {
        return formationRepository.findAll();
    }


    // Create a new Formation
    @PostMapping("/formations")
    public FormationEntity createFormation(@Valid @RequestBody FormationEntity formation) {
        return formationRepository.save(formation);
    }

    // Get a Single Formation
    @GetMapping("/formations/{id}")
    public FormationEntity getFormationById(@PathVariable(value = "id") String formationId) {
        return formationRepository.findById(formationId)
                .orElseThrow(() -> new ResourceNotFoundException("Formation", "id", formationId));
    }

    @GetMapping("/formations/nom/{nom}")
    public List<FormationEntity> getFormationByNom(@PathVariable(value = "nom") String formationName) {
        return formationRepository.findByNomFormation(formationName);
        //.orElseThrow(() -> new ResourceNotFoundException("Formation", "nom", formationName));
    }


    // Delete a Promotion
    @DeleteMapping("/formation/{id}")
    public ResponseEntity<?> deleteFormation(@PathVariable(value = "id") String formationId) {
        FormationEntity formation = formationRepository.findById(formationId)
                .orElseThrow(() -> new ResourceNotFoundException("Formation", "id", formationId));

        formationRepository.delete(formation);

        return ResponseEntity.ok().build();


    }
    @DeleteMapping("/formations")
    public ResponseEntity<?> deleteFormations() {

        formationRepository.deleteAll();

        return ResponseEntity.ok().build();


    }


=======
package com.example.demo.MainApplication.Controller;

import com.example.demo.MainApplication.Exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import com.example.demo.MainApplication.DAO.FormationEntity;
import com.example.demo.MainApplication.Repository.FormationRepository;

import java.util.List;

@RestController
@RequestMapping("/projetagile")
public class FormationController {


    @Autowired
    FormationRepository formationRepository;

    // Get All Formations
    @GetMapping("/formations")
    public List<FormationEntity> getAllFormations() {
        return formationRepository.findAll();
    }


    // Create a new Formation
    @PostMapping("/formations")
    public FormationEntity createFormation(@Valid @RequestBody FormationEntity formation) {
        return formationRepository.save(formation);
    }

    // Get a Single Formation
    @GetMapping("/formations/{id}")
    public FormationEntity getFormationById(@PathVariable(value = "id") String formationId) {
        return formationRepository.findById(formationId)
                .orElseThrow(() -> new ResourceNotFoundException("Formation", "id", formationId));
    }

    @GetMapping("/formations/nom/{nom}")
    public List<FormationEntity> getFormationByNom(@PathVariable(value = "nom") String formationName) {
        return formationRepository.findByNomFormation(formationName);
        //.orElseThrow(() -> new ResourceNotFoundException("Formation", "nom", formationName));
    }


    // Delete a Promotion
    @DeleteMapping("/formation/{id}")
    public ResponseEntity<?> deleteFormation(@PathVariable(value = "id") String formationId) {
        FormationEntity formation = formationRepository.findById(formationId)
                .orElseThrow(() -> new ResourceNotFoundException("Formation", "id", formationId));

        formationRepository.delete(formation);

        return ResponseEntity.ok().build();


    }
    @DeleteMapping("/formations")
    public ResponseEntity<?> deleteFormations() {

        formationRepository.deleteAll();

        return ResponseEntity.ok().build();


    }


>>>>>>> 3e9671bca416637a528adfa3ea13b75234c574a6
}