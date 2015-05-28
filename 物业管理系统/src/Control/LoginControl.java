package Control;
import java.util.List;

import org.hibernate.Session;

import Dao.LoginDAO;
import Factory.HibernateSessionFactory;
import Model.Login;
public class LoginControl {
	private static LoginControl control = null;

	public static LoginControl getControl() {
		if (control == null) {
			control = new LoginControl();
		}
		return control;
	}

	private static LoginDAO LoginDao = null;
	private Session session = null;	
	public LoginControl() {
		LoginDao = new LoginDAO();
		session = HibernateSessionFactory.getSession();
	}
	
	public Boolean save(String userName, String password) {
		try {
			Login Login = new Login(userName,password);
			LoginDao.save(Login);
			session.beginTransaction().commit();
			session.flush();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Boolean save(Login Login) {
		try {
			LoginDao.save(Login);
			session.beginTransaction().commit();
			session.flush();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean delete(Login Login) {
		try {

			LoginDao.delete(Login);
			session.beginTransaction().commit();
			session.flush();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	public Login findById(String Id) {
		try {
			Login Login = LoginDao.findById(Id);
			return Login;
		} catch (Exception e) {
			return null;
		}

	}
	
	public List findByPassword(String password)
	{
		try
		{
			return LoginDao.findByPassword(password);
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
			return LoginDao.findAll();
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public Boolean update(Login Login)
	{
		try
		{
			LoginDao.merge(Login);
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
	public static Boolean isUser(String username,String password)
	{
		try{
			Login login = (Login)LoginDao.findByProperty("userName",username).get(0);
			if(password.equals(login.getPassword()))
				return true;
				else
					return false;
		}catch(Exception e){
			return false;
		}
		
	}
}
