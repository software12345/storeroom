package Model;

/**
 * Building2 entity. @author MyEclipse Persistence Tools
 */
public class Building2 extends AbstractBuilding2 implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Building2() {
	}

	/** full constructor */
	public Building2(String roomNumber, String floorNumber, String uniteNumber,
			String hoster, String hosterId, String hosterPhone,
			String repairManagement) {
		super(roomNumber, floorNumber, uniteNumber, hoster, hosterId,
				hosterPhone, repairManagement);
	}

}
