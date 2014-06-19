package mx.ipn.cidetec.virtual.controllers;

import mx.ipn.cidetec.virtual.entities.User;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;

import javax.persistence.EntityManager;

/**
 * -
 *
 * @author Sergio Ceron F.
 * @version rev: %I%
 * @date 25/05/14 07:23 PM
 */
@Name( "registerController" )
public class RegisterController {

	@In
	private EntityManager em;

	private User user = new User();
	private String repassword;

	public String register() {
		try {
			em.persist( user );
			em.flush();
			return "success";
		} catch ( Exception e ) {
			e.printStackTrace();
		}
		return "failed";
	}

	public User getUser() {
		return user;
	}

	public void setUser( User user ) {
		this.user = user;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword( String repassword ) {
		this.repassword = repassword;
	}
}
