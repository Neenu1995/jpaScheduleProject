package co.pragra.firstproject.jpaproject.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "table_instructor")
@NoArgsConstructor
public class Instructor extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long _id;
    private String _name;
    private String _description;
    private String _avatarURL;
    @OneToOne(mappedBy = "_intructor")
    private ProgramDetails _programDetails;
}
