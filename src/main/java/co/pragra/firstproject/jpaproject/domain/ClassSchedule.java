package co.pragra.firstproject.jpaproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;


@Data
@Entity
@Table(name = "table_schedule")
@NoArgsConstructor
public class ClassSchedule extends  BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private int weekOfYear;
    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
   private Map<String,TimeSlots> scheduleMap = new HashMap<>();

}
