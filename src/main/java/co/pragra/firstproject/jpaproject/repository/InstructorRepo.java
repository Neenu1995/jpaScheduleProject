package co.pragra.firstproject.jpaproject.repository;

import co.pragra.firstproject.jpaproject.domain.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  InstructorRepo extends JpaRepository<Instructor, Long> {
}
