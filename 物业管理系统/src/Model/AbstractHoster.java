package Model;

/**
 * AbstractHoster entity provides the base persistence definition of the Hoster
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHoster implements java.io.Serializable {

	// Fields

	private String hosterId;
	private String hosterName;
	private String hoserPhone;
	private String propertyCosts;
	private String deposit;

	// Constructors

	/** default constructor */
	public AbstractHoster() {
	}

	/** full constructor */
	public AbstractHoster(String hosterId, String hosterName,
			String hoserPhone, String propertyCosts, String deposit) {
		this.hosterId = hosterId;
		this.hosterName = hosterName;
		this.hoserPhone = hoserPhone;
		this.propertyCosts = propertyCosts;
		this.deposit = deposit;
	}

	// Property accessors

	public String getHosterId() {
		return this.hosterId;
	}

	public void setHosterId(String hosterId) {
		this.hosterId = hosterId;
	}

	public String getHosterName() {
		return this.hosterName;
	}

	public void setHosterName(String hosterName) {
		this.hosterName = hosterName;
	}

	public String getHoserPhone() {
		return this.hoserPhone;
	}

	public void setHoserPhone(String hoserPhone) {
		this.hoserPhone = hoserPhone;
	}

	public String getPropertyCosts() {
		return this.propertyCosts;
	}

	public void setPropertyCosts(String propertyCosts) {
		this.propertyCosts = propertyCosts;
	}

	public String getDeposit() {
		return this.deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

}