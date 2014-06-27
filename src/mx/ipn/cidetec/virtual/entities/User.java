package mx.ipn.cidetec.virtual.entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;
import javax.persistence.InheritanceType;
import javax.persistence.Column;


/**
 * -
 *
 * @author Sergio Ceron F.
 * @version rev: %I%
 * @date 25/05/14 07:25 PM
 */
@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class User {
	private String username;
	private String password;
	private String name;
	private String lastname;
	private String email;
    private Role role;


	@Id
	@NotNull
	public String getUsername() {
		return username;
	}

	public void setUsername( String username ) {
		this.username = username;
	}

	@NotNull
	public String getPassword() {
		return password;
	}

	public void setPassword(String hash) {
		this.password = hash;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
		return email;
	}

	public void setEmail( String email ) {
		this.email = email;
	}

    @ManyToOne
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
