package mx.ipn.cidetec.virtual.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by sergio on 12/06/2014.
 */
@Entity
public class Alumno extends User {
    private int semestre;
    private List<CursoAlumno> cursos;
    //private List<Evaluacion> evaluaciones;

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id.alumno")
    public List<CursoAlumno> getCursos() {
        return cursos;
    }

    public void setCursos(List<CursoAlumno> cursos) {
        this.cursos = cursos;
    }

    //@OneToMany
    //public List<Evaluacion> getEvaluaciones() {
    //    return evaluaciones;
    //}

    //public void setEvaluaciones(List<Evaluacion> evaluaciones) {
    //    this.evaluaciones = evaluaciones;
    //}
}
