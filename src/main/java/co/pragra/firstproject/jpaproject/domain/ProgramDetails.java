package co.pragra.firstproject.jpaproject.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "'table_programs'")
@NoArgsConstructor
public class ProgramDetails extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String _name;
    private String _description;
    private String duration;
    private  Double fee;
    private  int spots;
    private  int availableSpots;
    @OneToOne(targetEntity = Instructor.class, cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
    private Instructor intructor;
    private  String picURL;
}
