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
    private ListaCriterios listaCriterios;
    private Alumno alumno;
    private Curso curso;
    private Date fecha;
    private List<Criterio> criterios;
    private boolean contestada;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    public ListaCriterios getListaCriterios() {
        return listaCriterios;
    }

    public void setListaCriterios(ListaCriterios listaCriterios) {
        this.listaCriterios = listaCriterios;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id.evaluacion")
    public List<Criterio> getCriterios() {
        return criterios;
    }

    public void setCriterios(List<Criterio> criterios) {
        this.criterios = criterios;
    }

    public boolean isContestada() {
        return contestada;
    }

    public void setContestada(boolean contestada) {
        this.contestada = contestada;
    }
}
