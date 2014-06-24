package mx.ipn.cidetec.virtual.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by sergio on 12/06/2014.
 */
@Entity
public class Evaluacion {
    private Long id;
    private List<Criterio> criterios;
    private Alumno alumno;
    private Curso curso;
    private Date fecha;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToMany
    public List<Criterio> getCriterios() {
        return criterios;
    }

    public void setCriterios(List<Criterio> criterios) {
        this.criterios = criterios;
    }

    @ManyToOne
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @ManyToOne
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
