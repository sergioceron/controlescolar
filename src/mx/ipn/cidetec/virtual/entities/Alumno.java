package mx.ipn.cidetec.virtual.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by sergio on 12/06/2014.
 */
@Entity
public class Alumno extends User {
    private int semestre;
    private List<Curso> cursos;

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @ManyToMany
    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
