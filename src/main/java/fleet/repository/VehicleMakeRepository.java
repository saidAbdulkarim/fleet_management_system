package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import fleet.model.VehicleMake;

public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
