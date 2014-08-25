package mx.ipn.cidetec.virtual.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Adrian on 22/08/2014.
 */
@Entity
@AssociationOverrides(value = {
        @AssociationOverride(name = "id.evaluacion",joinColumns = @JoinColumn(name = "id_evaluacion")),
        @AssociationOverride(name = "id.criterio",joinColumns = @JoinColumn(name = "id_criterio"))})
public class EvaluacionCriterio implements Serializable {
    private EvaluacionCriterioId id;
    private int valor;

    @EmbeddedId
    public EvaluacionCriterioId getId() {
        return id;
    }

    public void setId(EvaluacionCriterioId id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EvaluacionCriterio)) return false;

        EvaluacionCriterio that = (EvaluacionCriterio) o;

        if (valor != that.valor) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + valor;
        return result;
    }
}
