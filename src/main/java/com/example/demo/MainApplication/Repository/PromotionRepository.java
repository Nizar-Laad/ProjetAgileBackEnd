<<<<<<< HEAD
package com.example.demo.MainApplication.Repository;
import com.example.demo.MainApplication.DAO.PromotionEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.demo.MainApplication.DAO.PromotionEntity;

@Repository
public interface PromotionRepository extends JpaRepository<PromotionEntity,PromotionEntityPK> {


    List<PromotionEntity> findBySiglePromotion(String SiglePromotion);
    List<PromotionEntity> findByLieuRentree(String LieuRentree);
}
=======
package com.example.demo.MainApplication.Repository;
import com.example.demo.MainApplication.DAO.PromotionEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.demo.MainApplication.DAO.PromotionEntity;

@Repository
public interface PromotionRepository extends JpaRepository<PromotionEntity,PromotionEntityPK> {


    List<PromotionEntity> findBySiglePromotion(String SiglePromotion);
    List<PromotionEntity> findByLieuRentree(String LieuRentree);
}
>>>>>>> 3e9671bca416637a528adfa3ea13b75234c574a6
