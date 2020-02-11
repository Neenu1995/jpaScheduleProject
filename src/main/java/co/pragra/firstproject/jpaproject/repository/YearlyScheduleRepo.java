package co.pragra.firstproject.jpaproject.repository;

import co.pragra.firstproject.jpaproject.domain.YearlySchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YearlyScheduleRepo extends JpaRepository <YearlySchedule,Long> {
    public YearlySchedule getBy_weekOfYear(int _weekOfYear);

}
