package Dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Model.Building2;

/**
 * A data access object (DAO) providing persistence and search support for
 * Building2 entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see Dao.Building2
 * @author MyEclipse Persistence Tools
 */
public class Building2DAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(Building2DAO.class);
	// property constants
	public static final String FLOOR_NUMBER = "floorNumber";
	public static final String UNITE_NUMBER = "uniteNumber";
	public static final String HOSTER = "hoster";
	public static final String HOSTER_ID = "hosterId";
	public static final String HOSTER_PHONE = "hosterPhone";
	public static final String REPAIR_MANAGEMENT = "repairManagement";

	public void save(Building2 transientInstance) {
		log.debug("saving Building2 instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Building2 persistentInstance) {
		log.debug("deleting Building2 instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Building2 findById(java.lang.String id) {
		log.debug("getting Building2 instance with id: " + id);
		try {
			Building2 instance = (Building2) getSession().get("Model.Building2",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Building2 instance) {
		log.debug("finding Building2 instance by example");
		try {
			List results = getSession().createCriteria("Model.Building2")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Building2 instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Building2 as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFloorNumber(Object floorNumber) {
		return findByProperty(FLOOR_NUMBER, floorNumber);
	}

	public List findByUniteNumber(Object uniteNumber) {
		return findByProperty(UNITE_NUMBER, uniteNumber);
	}

	public List findByHoster(Object hoster) {
		return findByProperty(HOSTER, hoster);
	}

	public List findByHosterId(Object hosterId) {
		return findByProperty(HOSTER_ID, hosterId);
	}

	public List findByHosterPhone(Object hosterPhone) {
		return findByProperty(HOSTER_PHONE, hosterPhone);
	}

	public List findByRepairManagement(Object repairManagement) {
		return findByProperty(REPAIR_MANAGEMENT, repairManagement);
	}

	public List findAll() {
		log.debug("finding all Building2 instances");
		try {
			String queryString = "from Building2";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Building2 merge(Building2 detachedInstance) {
		log.debug("merging Building2 instance");
		try {
			Building2 result = (Building2) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Building2 instance) {
		log.debug("attaching dirty Building2 instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Building2 instance) {
		log.debug("attaching clean Building2 instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}