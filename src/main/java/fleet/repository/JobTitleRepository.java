package fleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import fleet.model.JobTitle;

public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
