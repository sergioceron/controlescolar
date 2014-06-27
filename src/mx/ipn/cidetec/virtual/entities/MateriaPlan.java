package mx.ipn.cidetec.virtual.entities;

import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by Adrian on 26/06/2014.
 */
public class MateriaPlan extends Materia {

    private int creditos;
    private List<PlanEstudios> planes;
    private boolean optativa;

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @ManyToMany
    public List<PlanEstudios> getPlanes() {
        return planes;
    }

    public void setPlanes(List<PlanEstudios> planes) {
        this.planes = planes;
    }

    public boolean isOptativa() {
        return optativa;
    }

    public void setOptativa(boolean optativa) {
        this.optativa = optativa;
    }
}
