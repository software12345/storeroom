package Model;

/**
 * Building entity. @author MyEclipse Persistence Tools
 */
public class Building extends AbstractBuilding implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Building() {
	}

	/** full constructor */
	public Building(String roomNumber, String floorNumber, String unitNumber,
			String hoster, String hosterId, String hosterPhone,
			String repairManagement) {
		super(roomNumber, floorNumber, unitNumber, hoster, hosterId,
				hosterPhone, repairManagement);
	}

}
