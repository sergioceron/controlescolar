package mx.ipn.cidetec.virtual.entities;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by Adrian on 27/06/2014.
 */
@Embeddable
public class CursoAlumnoId implements Serializable {
    private Curso curso;
    private Alumno alumno;

    @ManyToOne
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @ManyToOne
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CursoAlumnoId)) return false;

        CursoAlumnoId that = (CursoAlumnoId) o;

        if (alumno != null ? !alumno.equals(that.alumno) : that.alumno != null) return false;
        if (curso != null ? !curso.equals(that.curso) : that.curso != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = curso != null ? curso.hashCode() : 0;
        result = 31 * result + (alumno != null ? alumno.hashCode() : 0);
        return result;
    }
}
