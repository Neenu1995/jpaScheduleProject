package co.pragra.firstproject.jpaproject.controller;

import co.pragra.firstproject.jpaproject.repository.InstructorRepo;
import co.pragra.firstproject.jpaproject.repository.ProgramRepo;
import co.pragra.firstproject.jpaproject.repository.YearlyScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassScheduleController {

    @Autowired
    private ProgramRepo programRepo;
    @Autowired
    private YearlyScheduleRepo scheduleRepo;
    @Autowired
    private InstructorRepo instructorRepo;

    @GetMapping("/program")
    public ResponseEntity<?> getSchedule(){
        return ResponseEntity.ok().body(programRepo.findAll());
    }

    @GetMapping("/program/{weekOfYear}")
    public ResponseEntity<?> getScheduleByWeek(@PathVariable("weekOfYear") int _weekOfYear){
        return ResponseEntity.ok().body(scheduleRepo.getBy_weekOfYear(_weekOfYear));
    }
    @GetMapping("/instructor")
    public  ResponseEntity<?> getAllInstructors(){
        return ResponseEntity.ok().body(instructorRepo.findAll());
    }
}
