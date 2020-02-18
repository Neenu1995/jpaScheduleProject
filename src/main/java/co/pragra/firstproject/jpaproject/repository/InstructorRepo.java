package co.pragra.firstproject.jpaproject.repository;

import co.pragra.firstproject.jpaproject.domain.Instructor;
import co.pragra.firstproject.jpaproject.domain.ProgramDetails;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface  InstructorRepo extends JpaRepository<Instructor, Long> {

    @Override
    @Query(value = "SELECT * FROM table_instructor",nativeQuery = true)
    <S extends Instructor> List<S> findAll(Example<S> example);

    @Override
    Optional<Instructor> findById(Long aLong);
}
