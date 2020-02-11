package co.pragra.firstproject.jpaproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Data
@Entity
@Table(name = "table_yearlySchedule")
@NoArgsConstructor
public class YearlySchedule extends  BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long _id;
    private int _weekOfYear;
    @OneToMany(mappedBy = "_yearlySchedule",cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = WeeklySchedule.class)
    private List<WeeklySchedule> _weeklyScheduleList = new ArrayList<>();

}
