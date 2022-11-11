package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import fleet.model.VehicleMaintenance;

public interface vehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Integer> {

}
