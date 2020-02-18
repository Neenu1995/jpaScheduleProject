package co.pragra.firstproject.jpaproject.controller;

import co.pragra.firstproject.jpaproject.domain.Instructor;
import co.pragra.firstproject.jpaproject.repository.InstructorRepo;
import co.pragra.firstproject.jpaproject.repository.ProgramRepo;
import co.pragra.firstproject.jpaproject.repository.YearlyScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @RequestMapping(value = "/instructor/{id}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<?> findById(@PathVariable("id") @DefaultValue("1") long id){
        /*Optional<Instructor> byId =  instructorRepo.findById(id);
        return ResponseEntity.ok().body(byId.orElseGet(Instructor::new));*/

        Optional<Instructor> byId =  instructorRepo.findById(id);
        return ResponseEntity.ok().body(byId.orElse(new Instructor(2,"leela","Java Teacher","jasjhsakhsaj")));
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
