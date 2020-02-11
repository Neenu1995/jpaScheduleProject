package co.pragra.firstproject.jpaproject.repository;

import co.pragra.firstproject.jpaproject.domain.WeeklySchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeeklyScheduleRepo extends JpaRepository<WeeklySchedule, Long> {
}
