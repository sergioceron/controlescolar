package mx.ipn.cidetec.virtual.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Created by Adrian on 26/06/2014.
 */
@Entity
public class Programa {
    private Long id;
    private String nombre;
    private List<PlanEstudios> planEstudios;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @OneToMany
    public List<PlanEstudios> getPlanEstudios() {
        return planEstudios;
    }

    public void setPlanEstudios(List<PlanEstudios> planEstudios) {
        this.planEstudios = planEstudios;
    }
}
