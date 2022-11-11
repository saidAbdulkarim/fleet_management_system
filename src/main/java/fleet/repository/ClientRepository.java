package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import fleet.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
