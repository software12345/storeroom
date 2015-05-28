package Model;

/**
 * AbstractBuilding entity provides the base persistence definition of the
 * Building entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBuilding implements java.io.Serializable {

	// Fields

	private String roomNumber;
	private String floorNumber;
	private String unitNumber;
	private String hoster;
	private String hosterId;
	private String hosterPhone;
	private String repairManagement;

	// Constructors

	/** default constructor */
	public AbstractBuilding() {
	}

	/** full constructor */
	public AbstractBuilding(String roomNumber, String floorNumber,
			String unitNumber, String hoster, String hosterId,
			String hosterPhone, String repairManagement) {
		this.roomNumber = roomNumber;
		this.floorNumber = floorNumber;
		this.unitNumber = unitNumber;
		this.hoster = hoster;
		this.hosterId = hosterId;
		this.hosterPhone = hosterPhone;
		this.repairManagement = repairManagement;
	}

	// Property accessors

	public String getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getFloorNumber() {
		return this.floorNumber;
	}

	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}

	public String getUnitNumber() {
		return this.unitNumber;
	}

	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}

	public String getHoster() {
		return this.hoster;
	}

	public void setHoster(String hoster) {
		this.hoster = hoster;
	}

	public String getHosterId() {
		return this.hosterId;
	}

	public void setHosterId(String hosterId) {
		this.hosterId = hosterId;
	}

	public String getHosterPhone() {
		return this.hosterPhone;
	}

	public void setHosterPhone(String hosterPhone) {
		this.hosterPhone = hosterPhone;
	}

	public String getRepairManagement() {
		return this.repairManagement;
	}

	public void setRepairManagement(String repairManagement) {
		this.repairManagement = repairManagement;
	}

}