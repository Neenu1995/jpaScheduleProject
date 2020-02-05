package co.pragra.firstproject.jpaproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Data
@Entity
@Table
@NoArgsConstructor
public class ClassSchedule extends  BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private int weekOfYear;
    @ManyToMany(cascade = CascadeType.ALL)
    private Map<String,TimeSlots> scheduleMap = new HashMap<>();

}
