package co.pragra.firstproject.jpaproject.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(name = "table_instructor")
@Entity
@NoArgsConstructor
public class Instructor extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String desc;
    private String avatarURL;
}
