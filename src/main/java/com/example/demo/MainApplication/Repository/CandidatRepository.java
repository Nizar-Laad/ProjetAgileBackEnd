package com.example.demo.MainApplication.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.demo.MainApplication.DAO.CandidatEntity;

@Repository
public interface CandidatRepository extends JpaRepository<CandidatEntity, String> {

   /* @Query("SELECT c FROM Candidat c WHERE c.nom = ?1 ")
    ThingEntity findCandidatByName(String nom);*/
   List<CandidatEntity> findByNom(String nom);
   List<CandidatEntity> findByUniversiteOrigine(String universiteOrigine);

}
