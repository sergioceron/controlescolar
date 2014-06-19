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
 * @date 3/06/14 11:18 PM
 */
@Name( "loginController" )
public class LoginController {

	@In
	private EntityManager em;

	private User user = new User();

	public String login() {
		User current = em.find( User.class, user.getUsername() );
		if( current != null ) {
			if( current.getPassword().equals( user.getPassword() ) ) {
				return "success";
			}
		}
		return "failed";
	}

	public User getUser() {
		return user;
	}

	public void setUser( User user ) {
		this.user = user;
	}
}
