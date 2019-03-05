package com.example.demo.MainApplication.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.demo.MainApplication.DAO.FormationEntity;

@Repository
public interface FormationRepository extends JpaRepository<FormationEntity, String> {


    List<FormationEntity> findByNomFormation(String nom);
}
