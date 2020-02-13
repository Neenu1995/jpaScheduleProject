package co.pragra.firstproject.jpaproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "table_instructor")
@NoArgsConstructor
@AllArgsConstructor

public class Instructor extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long _id;
    private String _name;
    private String _description;
    private String _avatarURL;

    public Instructor(String _name, String _description){
        this._name = _name;
        this._description = _description;
    }
}
