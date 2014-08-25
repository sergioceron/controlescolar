package mx.ipn.cidetec.virtual.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Adrian on 27/06/2014.
 */
@Entity
@AssociationOverrides(value = {
        @AssociationOverride(name = "id.alumno",joinColumns = @JoinColumn(name = "username")),
        @AssociationOverride(name = "id.curso",joinColumns = @JoinColumn(name = "id"))})
public class CursoAlumno implements Serializable {

    private CursoAlumnoId id;
    private double calificacion;
    private Evaluacion evaluacion;

    @EmbeddedId
    public CursoAlumnoId getId() {
        return id;
    }

    public void setId(CursoAlumnoId id) {
        this.id = id;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @OneToOne
    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CursoAlumno)) return false;

        CursoAlumno that = (CursoAlumno) o;

        if (Double.compare(that.calificacion, calificacion) != 0) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (getId() != null ? getId().hashCode() : 0);
    }
}
