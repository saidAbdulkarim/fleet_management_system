package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import fleet.model.State;

public interface StateRepository extends JpaRepository<State, Integer> {

}
