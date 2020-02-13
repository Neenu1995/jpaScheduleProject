package co.pragra.firstproject.jpaproject.domain;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Data
public class BaseEntity {

    private Date create_date;
    private Date  update_date;
}
