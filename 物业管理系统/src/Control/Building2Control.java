package Control;
import java.util.List;

import org.hibernate.Session;

import Dao.Building2DAO;
import Factory.HibernateSessionFactory;
import Model.Building;
import Model.Building2;
public class Building2Control {
	private static Building2Control control = null;

	public static Building2Control getControl() {
		if (control == null) {
			control = new Building2Control();
		}
		return control;
	}

	private static Building2DAO Building2Dao = null;
	private Session session = null;	
	public Building2Control() {
		Building2Dao = new Building2DAO();
		session = HibernateSessionFactory.getSession();
	}
	public Boolean save(String FloorNumber, String UnitNumber, String RoomNumber,
			String Hoster, String HosterID, String HosterPhone,String RepairManagement) {
		try {
			Building2 Building2 = new Building2(FloorNumber,UnitNumber,RoomNumber,
					Hoster,HosterID,
					HosterPhone, RepairManagement);
			Building2Dao.save(Building2);
			session.beginTransaction().commit();
			session.flush();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Boolean save(Building2 Building2) {
		try {
			Building2Dao.save(Building2);
			session.beginTransaction().commit();
			session.flush();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean delete(Building2 Building2) {
		try {

			Building2Dao.delete(Building2);
			session.beginTransaction().commit();
			session.flush();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	public Building2 findById(String Id) {
		try {
			Building2 Building2 = Building2Dao.findById(Id);
			return Building2;
		} catch (Exception e) {
			return null;
		}

	}
	
	public List findByFloorNumber(String floornumber)
	{
		try
		{
			return Building2Dao.findByFloorNumber(floornumber);
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
			return Building2Dao.findAll();
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public List findByUnitNumber(String unitnumber)
	{
		try
		{
			return Building2Dao.findByUniteNumber(unitnumber);
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public Boolean update(Building2 Building2)
	{
		try
		{
			Building2Dao.merge(Building2);
			session.beginTransaction().commit();
			session.flush();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public static Boolean isUser(String floornumber,String roomnumber)
	{
		try{
			Building2 building2 = (Building2)Building2Dao.findByProperty("userName",roomnumber).get(0);
			if(floornumber.equals(building2.getFloorNumber()))
				return true;
				else
					return false;
		}catch(Exception e){
			return false;
		}
		
	}
}
