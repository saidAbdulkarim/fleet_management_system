package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import fleet.model.Contact;

public interface VehicleMovementRepository extends JpaRepository<Contact, Integer> {

}
