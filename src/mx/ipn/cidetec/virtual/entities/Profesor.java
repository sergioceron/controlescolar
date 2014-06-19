package mx.ipn.cidetec.virtual.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by sergio on 12/06/2014.
 */
@Entity
public class Profesor extends User {
    private List<Curso> cursos;

    @OneToMany
    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
