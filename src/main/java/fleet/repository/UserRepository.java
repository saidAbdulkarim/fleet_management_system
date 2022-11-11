package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import fleet.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
