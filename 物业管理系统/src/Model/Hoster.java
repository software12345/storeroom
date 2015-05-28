package Model;

/**
 * Hoster entity. @author MyEclipse Persistence Tools
 */
public class Hoster extends AbstractHoster implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Hoster() {
	}

	/** full constructor */
	public Hoster(String hosterName, String hosterId, String hoserPhone,
			String propertyCosts, String deposit) {
		super(hosterId, hosterName, hoserPhone, propertyCosts, deposit);
	}

}
