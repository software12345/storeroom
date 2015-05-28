package Model;

/**
 * AbstractBuilding2 entity provides the base persistence definition of the
 * Building2 entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBuilding2 implements java.io.Serializable {

	// Fields

	private String roomNumber;
	private String floorNumber;
	private String uniteNumber;
	private String hoster;
	private String hosterId;
	private String hosterPhone;
	private String repairManagement;

	// Constructors

	/** default constructor */
	public AbstractBuilding2() {
	}

	/** full constructor */
	public AbstractBuilding2(String roomNumber, String floorNumber,
			String uniteNumber, String hoster, String hosterId,
			String hosterPhone, String repairManagement) {
		this.roomNumber = roomNumber;
		this.floorNumber = floorNumber;
		this.uniteNumber = uniteNumber;
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

	public String getUniteNumber() {
		return this.uniteNumber;
	}

	public void setUniteNumber(String uniteNumber) {
		this.uniteNumber = uniteNumber;
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