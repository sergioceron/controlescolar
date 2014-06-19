package mx.ipn.cidetec.virtual.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by sergio on 12/06/2014.
 */
@Entity
public class Materia {
    private String clave;
    private String name;
    private int creditos;
    private int plan;
    private boolean optativa;

    @Id
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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public boolean isOptativa() {
        return optativa;
    }

    public void setOptativa(boolean optativa) {
        this.optativa = optativa;
    }
}
