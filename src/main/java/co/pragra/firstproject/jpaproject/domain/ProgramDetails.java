package co.pragra.firstproject.jpaproject.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table
@NoArgsConstructor
public class ProgramDetails extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String desc;
    private String duration;
    private  Double fee;
    private  int spots;
    private  int availableSpots;
    @OneToOne(targetEntity = Instructor.class,fetch = FetchType.LAZY)
    private Instructor intructor;
    private  String picURL;
}
