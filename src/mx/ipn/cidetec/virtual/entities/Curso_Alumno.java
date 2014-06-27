package mx.ipn.cidetec.virtual.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Adrian on 27/06/2014.
 */
@Entity
@AssociationOverrides(value = {
        @AssociationOverride(name = "id.alumno"),
        @AssociationOverride(name = "id.curso")})
public class Curso_Alumno implements Serializable {

    private CursoAlumnoId id;
    private double calificacion;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso_Alumno)) return false;

        Curso_Alumno that = (Curso_Alumno) o;

        if (Double.compare(that.calificacion, calificacion) != 0) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        temp = Double.doubleToLongBits(calificacion);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
