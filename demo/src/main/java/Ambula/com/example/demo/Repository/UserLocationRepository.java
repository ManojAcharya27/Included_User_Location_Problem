package Ambula.com.example.demo.Repository;

import Ambula.com.example.demo.Entity.User_Location;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserLocationRepository extends JpaRepository<User_Location,Integer> {

    List<User_Location> findAllByExcludedFalseOrderByDistanceAsc(Pageable pageable, Double latitude, Double longitude);
}
