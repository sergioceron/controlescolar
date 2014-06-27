package mx.ipn.cidetec.virtual.entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.List;

/**
 * Created by sergio on 12/06/2014.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Materia {
    private String clave;
    private String name;


    @Id
    @NotNull
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
