package co.pragra.firstproject.jpaproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;



    @Component
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public class Error {
        private int code;
        private String message;

    }

