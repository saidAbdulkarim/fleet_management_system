package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import fleet.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
