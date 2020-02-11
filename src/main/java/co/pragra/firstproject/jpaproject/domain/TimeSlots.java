package co.pragra.firstproject.jpaproject.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "table_slots")
@NoArgsConstructor
public class TimeSlots {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long _id;
    private long _slot1;
    private long _slot2;
    private long _slot3;
    private long _slot4;
    @ManyToOne
    @JoinColumn
     private WeeklySchedule _weeklySchedule;

}
