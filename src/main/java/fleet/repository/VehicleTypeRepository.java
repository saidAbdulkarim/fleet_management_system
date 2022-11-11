package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import fleet.model.VehicleType;

public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
