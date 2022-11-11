package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import fleet.model.VehicleHire;

public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
