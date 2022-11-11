package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import fleet.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
