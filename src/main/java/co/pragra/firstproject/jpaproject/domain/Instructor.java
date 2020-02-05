package co.pragra.firstproject.jpaproject.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "'table_instructor'")
@NoArgsConstructor
public class Instructor extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String desc;
    private String avatarURL;
}
