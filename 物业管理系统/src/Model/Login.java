package Model;

/**
 * Login entity. @author MyEclipse Persistence Tools
 */
public class Login extends AbstractLogin implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Login() {
	}

	/** full constructor */
	public Login(String userName, String password) {
		super(userName, password);
	}

}
