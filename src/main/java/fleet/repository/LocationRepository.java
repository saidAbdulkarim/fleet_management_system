package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import fleet.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
