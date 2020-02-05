package co.pragra.firstproject.jpaproject.repository;

import co.pragra.firstproject.jpaproject.domain.ProgramDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepo extends JpaRepository<ProgramDetails,Long> {
}
