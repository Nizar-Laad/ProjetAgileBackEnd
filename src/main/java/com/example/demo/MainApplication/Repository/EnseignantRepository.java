package com.example.demo.MainApplication.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.demo.MainApplication.DAO.EnseignantEntity;

@Repository
public interface EnseignantRepository extends JpaRepository<EnseignantEntity, Integer> {


    List<EnseignantEntity> findByNom(String nom);
    List<EnseignantEntity> findByEmailUbo(String emailUbo);

}
