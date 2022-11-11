package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fleet.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
