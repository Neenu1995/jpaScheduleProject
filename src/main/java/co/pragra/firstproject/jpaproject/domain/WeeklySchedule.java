package co.pragra.firstproject.jpaproject.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "table_weeklySchedule")
public class WeeklySchedule extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long _id;
    private String _dayOfWeek;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = TimeSlots.class)
    private List<TimeSlots> _dailyScheduleList = new ArrayList<>();


}
