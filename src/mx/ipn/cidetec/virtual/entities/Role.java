package mx.ipn.cidetec.virtual.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by sergio on 12/06/2014.
 */
@Entity
public class Role {
    private long id;
    private String name;

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
