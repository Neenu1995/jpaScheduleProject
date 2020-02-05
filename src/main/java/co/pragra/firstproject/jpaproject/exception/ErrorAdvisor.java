package co.pragra.firstproject.jpaproject.exception;

import co.pragra.firstproject.jpaproject.domain.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ErrorAdvisor {
    @ExceptionHandler(value = ScheduleNotFoundException.class)
    public ResponseEntity<Error> handleNotFound(){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error(404,"Not Found"));
    }

    @ExceptionHandler(value = ArithmeticException.class)
    public ResponseEntity<Error> conflict(){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error(404,"Some Conflict"));
    }
}
