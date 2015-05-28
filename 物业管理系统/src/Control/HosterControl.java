package Control;
import java.util.List;

import org.hibernate.Session;

import Dao.HosterDAO;
import Factory.HibernateSessionFactory;
import Model.Hoster;
import Model.Login;
public class HosterControl {
	private static HosterControl control = null;

	public static HosterControl getControl() {
		if (control == null) {
			control = new HosterControl();
		}
		return control;
	}

	private  HosterDAO HosterDao = null;
	private  Session session = null;	
	public HosterControl() {
		HosterDao = new HosterDAO();
		session = HibernateSessionFactory.getSession();
	}
	public  Boolean save(String hosterId, String hosterName, String hoserPhone,
			String propertyCosts, String deposit) {
		try {
			Hoster Hoster = new Hoster(hosterId, hosterName, hoserPhone,
					 propertyCosts, deposit);
			HosterDao.save(Hoster);
			session.beginTransaction().commit();
			session.flush();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Boolean save(Hoster Hoster) {
		try {
			HosterDao.save(Hoster);
			session.beginTransaction().commit();
			session.flush();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean delete(Hoster Hoster) {
		try {

			HosterDao.delete(Hoster);
			session.beginTransaction().commit();
			session.flush();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	public Hoster findById(String Id) {
		try {
			Hoster Building = HosterDao.findById(Id);
			return Building;
		} catch (Exception e) {
			return null;
		}

	}
	
	public List findByHosterName(String hostername)
	{
		try
		{
			return HosterDao.findByHosterName(hostername);
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
			return HosterDao.findAll();
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public List findByHosterPhone(String hosterphone)
	{
		try
		{
			return HosterDao.findByHoserPhone(hosterphone);
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public  Boolean update(Hoster Hoster)
	{
		try
		{
			HosterDao.merge(Hoster);
			session.beginTransaction().commit();
			session.flush();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public  Boolean isUser(String id,String name)
	{
		try{
			Hoster hoster = (Hoster)HosterDao.findByProperty("HosterID",id).get(0);
			if(name.equals(hoster.getHosterName()))
				return true;
				else
					return false;
		}catch(Exception e){
			return false;
		}
		
	}
}
