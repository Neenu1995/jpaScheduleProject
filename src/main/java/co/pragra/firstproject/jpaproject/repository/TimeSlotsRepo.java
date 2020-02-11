package co.pragra.firstproject.jpaproject.repository;

import co.pragra.firstproject.jpaproject.domain.TimeSlots;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeSlotsRepo extends JpaRepository<TimeSlots, Long> {
}
