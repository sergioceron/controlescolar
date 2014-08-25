package mx.ipn.cidetec.virtual.entities;

import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by Adrian on 22/08/2014.
 */
@Embeddable
public class EvaluacionCriterioId implements Serializable {
    private Evaluacion evaluacion;
    private Criterio criterio;

    @ManyToOne
    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    @ManyToOne
    public Criterio getCriterio() {
        return criterio;
    }

    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EvaluacionCriterioId)) return false;

        EvaluacionCriterioId that = (EvaluacionCriterioId) o;

        if (criterio != null ? !criterio.equals(that.criterio) : that.criterio != null) return false;
        if (evaluacion != null ? !evaluacion.equals(that.evaluacion) : that.evaluacion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = evaluacion != null ? evaluacion.hashCode() : 0;
        result = 31 * result + (criterio != null ? criterio.hashCode() : 0);
        return result;
    }
}
