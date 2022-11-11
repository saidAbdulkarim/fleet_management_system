package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import fleet.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
