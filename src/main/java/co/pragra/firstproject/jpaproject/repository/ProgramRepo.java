package co.pragra.firstproject.jpaproject.repository;

import co.pragra.firstproject.jpaproject.domain.ProgramDetails;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgramRepo extends JpaRepository<ProgramDetails,Long> {
    @Override
    @Query(value = "SELECT * FROM table_programs",nativeQuery = true)
    <S extends ProgramDetails> List<S> findAll(Example<S> example);

}
