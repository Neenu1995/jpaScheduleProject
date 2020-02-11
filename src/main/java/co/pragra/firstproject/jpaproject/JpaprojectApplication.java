package co.pragra.firstproject.jpaproject;

import co.pragra.firstproject.jpaproject.domain.Instructor;
import co.pragra.firstproject.jpaproject.domain.ProgramDetails;
import co.pragra.firstproject.jpaproject.repository.InstructorRepo;
import co.pragra.firstproject.jpaproject.repository.ProgramRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaprojectApplication {

    @Autowired
    private ProgramRepo programRepo;
    @Autowired
    private InstructorRepo instructorRepo;

    public static void main(String[] args) {
        SpringApplication.run(JpaprojectApplication.class, args);
    }

    CommandLineRunner runner(){
        return args->{
            Instructor instructor = new Instructor();
            instructor.set_name("Neenu");
            instructor.set_description("Java Full Stack Developer");
            instructor = instructorRepo.save(instructor);
            instructorRepo.save(instructor);

            ProgramDetails programDetails = new ProgramDetails();
            programDetails.set_name("Java");
            //programDetails.set_intructor(instructor);
            programDetails.set_fee(250.00);
            programRepo.saveAndFlush(programDetails);
        };
    }
}
