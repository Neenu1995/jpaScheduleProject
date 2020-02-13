package co.pragra.firstproject.jpaproject.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "table_programs")
@NoArgsConstructor
public class ProgramDetails extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long _id;
    private String _name;
    private String _description;
    private String _duration;
    private  Double _fee;
    private  int _spots;
    private  int _availableSpots;
    @ManyToOne(targetEntity = Instructor.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Instructor _intructor;
    private  String _picURL;

    public ProgramDetails(String _name, String _description, Instructor instructor) {
        this._name = _name;
        this._description = _description;
        this._intructor = instructor;
    }
}
