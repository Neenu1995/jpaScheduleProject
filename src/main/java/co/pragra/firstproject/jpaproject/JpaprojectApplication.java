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
public class JpaprojectApplication  {

    @Autowired
    private ProgramRepo programRepo;
    @Autowired
    private InstructorRepo instructorRepo;

    public static void main(String[] args) {
        SpringApplication.run(JpaprojectApplication.class, args);
    }



    @Bean
    CommandLineRunner runner(){
        return args->{

           instructorRepo.save(new Instructor("Neenu","Java Full Stack Developer"));
           instructorRepo.save(new Instructor("Aghil","Electrical Engineering"));

           programRepo.saveAndFlush(new ProgramDetails("Java 101","Introduction to java",new Instructor("Aghil","Electrical Engineering")));
        };
    }
}
