package co.pragra.firstproject.jpaproject.controller;

import co.pragra.firstproject.jpaproject.repository.ProgramRepo;
import co.pragra.firstproject.jpaproject.service.ClassScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassScheduleController {

    @Autowired
    private ProgramRepo programRepo;

    @GetMapping("/programs")
    public ResponseEntity<?> getSchedule(){
        return ResponseEntity.ok().body(programRepo.findAll());
    }
}
