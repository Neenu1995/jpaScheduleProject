package co.pragra.firstproject.jpaproject.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table
@NoArgsConstructor
public class TimeSlots {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long slot1;
    private long slot2;
    private long slot3;
    private long slot4;

}
