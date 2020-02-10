package co.pragra.firstproject.jpaproject.repository;

import co.pragra.firstproject.jpaproject.domain.ClassSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepo extends JpaRepository <ClassSchedule,Long> {
    public  ClassSchedule getByWeekOfYear(int weekOfYear);

}
