package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import fleet.model.VehicleStatus;

public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
