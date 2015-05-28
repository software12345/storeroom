package Model;

/**
 * AbstractLogin entity provides the base persistence definition of the Login
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLogin implements java.io.Serializable {

	// Fields

	private String userName;
	private String password;

	// Constructors

	/** default constructor */
	public AbstractLogin() {
	}

	/** full constructor */
	public AbstractLogin(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	// Property accessors

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}