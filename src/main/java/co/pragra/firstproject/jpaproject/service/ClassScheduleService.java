package co.pragra.firstproject.jpaproject.service;

import co.pragra.firstproject.jpaproject.domain.ClassSchedule;
import co.pragra.firstproject.jpaproject.exception.ScheduleNotFoundException;

import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ClassScheduleService {
    @Autowired
    private List<ClassSchedule> scheduleList = new ArrayList<>();

    public ClassSchedule getScheduleByWeek(int weekOfYear){
        Optional<ClassSchedule> schedule = scheduleList.stream().filter(s-> s.getWeekOfYear() == weekOfYear ).limit(1).findFirst();
        try {
            if(schedule.get()== null){
                throw new ScheduleNotFoundException();
            }
        }catch (NoSuchElementException ex){
            throw  new ScheduleNotFoundException();

        }
        return  schedule.get();
    }
}
