package mx.ipn.cidetec.virtual.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by sergio on 12/06/2014.
 */
@Entity
public class Curso {
    private Long id;
    private Materia materia;
    private Profesor profesor;
    private List<Curso_Alumno> alumnos;
    private Date inicio;
    private Date termino;
    private List<Hora> horario;
    private Semestre semestre;


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    //@Column(name = "id_curso")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @ManyToOne
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @OneToMany(fetch = FetchType.LAZY)//,mappedBy = id.curso)
    public List<Curso_Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Curso_Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getTermino() {
        return termino;
    }

    public void setTermino(Date termino) {
        this.termino = termino;
    }

    @OneToMany
    public List<Hora> getHorario() {
        return horario;
    }

    public void setHorario(List<Hora> horario) {
        this.horario = horario;
    }
}
