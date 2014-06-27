package mx.ipn.cidetec.virtual.controllers;

import mx.ipn.cidetec.virtual.entities.*;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * -
 *
 * @author Sergio Ceron F.
 * @version rev: %I%
 * @date 3/06/14 11:18 PM
 */
@Name( "sessionController" )
@Scope( ScopeType.SESSION )
public class SessionController {

	@In
	private EntityManager em;

	private Alumno user = new Alumno();

	public String login() {
		Alumno current = em.find( Alumno.class, user.getUsername() );
		if( current != null ) {
			if( current.getPassword().equals( user.getPassword() ) ) {
                user = current;
                CursoAlumnoId cai=new CursoAlumnoId();
                cai.setAlumno(user);
                user.setCursos((List<Curso_Alumno>) em.find(Curso_Alumno.class, cai));
				return "success";
			}
		}
		return "failed";
	}
	public Alumno getUser() {
		return user;
	}

	public void setUser( Alumno user ) {
		this.user = user;
	}
}
