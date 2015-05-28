package Control;
import java.util.List;

import org.hibernate.Session;

import Dao.BuildingDAO;
import Factory.HibernateSessionFactory;
import Model.Building;
public class BuildingControl {
	private static BuildingControl control = null;

	public static BuildingControl getControl() {
		if (control == null) {
			control = new BuildingControl();
		}
		return control;
	}

	private static BuildingDAO BuildingDao = null;
	private static Session session = null;	
	public BuildingControl() {
		BuildingDao = new BuildingDAO();
		session = HibernateSessionFactory.getSession();
	}
	
	public Boolean save(String roomNumber, String floorNumber, String unitNumber,
			String hoster, String hosterId, String hosterPhone,
			String repairManagement) {
		try {
			Building Building = new Building(roomNumber,floorNumber,unitNumber,
					hoster,hosterId,hosterPhone,
					repairManagement);
			BuildingDao.save(Building);
			session.beginTransaction().commit();
			session.flush();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Boolean save(Building Building) {
		try {
			BuildingDao.save(Building);
			session.beginTransaction().commit();
			session.flush();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static Boolean delete(Building Building) {
		try {

			BuildingDao.delete(Building);
			session.beginTransaction().commit();
			session.flush();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	public Building findById(String Id) {
		try {
			Building Building = BuildingDao.findById(Id);
			return Building;
		} catch (Exception e) {
			return null;
		}

	}
	
	public List findByFloorNumber(String floornumber)
	{
		try
		{
			return BuildingDao.findByFloorNumber(floornumber);
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public List findAll()
	{
		try
		{
			return BuildingDao.findAll();
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public  Boolean update(Building Building)
	{
		try
		{
			BuildingDao.merge(Building);
			session.beginTransaction().commit();
			session.flush();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	/*public Login getLoginByName(String username){
		
		  return (Login)LoginDao.findByProperty("userName",username).get(0);

		}*/
	public Boolean isUser(String floornumber,String roomnumber)
	{
		try{
			Building building = (Building)BuildingDao.findByProperty("RoomNumber",roomnumber).get(0);
			if(floornumber.equals(building.getFloorNumber()))
				return true;
				else
					return false;
		}catch(Exception e){
			return false;
		}
		
	}
}
