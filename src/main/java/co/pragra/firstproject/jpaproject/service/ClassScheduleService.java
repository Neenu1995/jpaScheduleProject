package co.pragra.firstproject.jpaproject.service;

import co.pragra.firstproject.jpaproject.domain.YearlySchedule;

import co.pragra.firstproject.jpaproject.repository.YearlyScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassScheduleService {

    private List<YearlySchedule> scheduleList = new ArrayList<>();
    @Autowired
    private YearlyScheduleRepo scheduleRepo;


    public YearlySchedule getScheduleByWeek(int weekOfYear){
       /* Optional<ClassSchedule> schedule = scheduleList.stream().filter(s-> s.getWeekOfYear() == weekOfYear ).limit(1).findFirst();
        try {
            if(schedule.get()== null){
                throw new ScheduleNotFoundException();
            }
        }catch (NoSuchElementException ex){
            throw  new ScheduleNotFoundException();

        }
        return  schedule.get();*/

       return  this.scheduleRepo.getBy_weekOfYear(weekOfYear);
    }
}
