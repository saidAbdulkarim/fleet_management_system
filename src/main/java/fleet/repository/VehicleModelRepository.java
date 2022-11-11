package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import fleet.model.VehicleModel;

public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
