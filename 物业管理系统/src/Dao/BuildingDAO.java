package Dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Model.Building;

/**
 * A data access object (DAO) providing persistence and search support for
 * Building entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see Dao.Building
 * @author MyEclipse Persistence Tools
 */
public class BuildingDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(BuildingDAO.class);
	// property constants
	public static final String FLOOR_NUMBER = "floorNumber";
	public static final String UNIT_NUMBER = "unitNumber";
	public static final String HOSTER = "hoster";
	public static final String HOSTER_ID = "hosterId";
	public static final String HOSTER_PHONE = "hosterPhone";
	public static final String REPAIR_MANAGEMENT = "repairManagement";

	public void save(Building transientInstance) {
		log.debug("saving Building instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Building persistentInstance) {
		log.debug("deleting Building instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Building findById(java.lang.String id) {
		log.debug("getting Building instance with id: " + id);
		try {
			Building instance = (Building) getSession().get("Model.Building", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Building instance) {
		log.debug("finding Building instance by example");
		try {
			List results = getSession().createCriteria("Model.Building")
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
		log.debug("finding Building instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Building as model where model."
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

	public List findByUnitNumber(Object unitNumber) {
		return findByProperty(UNIT_NUMBER, unitNumber);
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
		log.debug("finding all Building instances");
		try {
			String queryString = "from Building";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Building merge(Building detachedInstance) {
		log.debug("merging Building instance");
		try {
			Building result = (Building) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Building instance) {
		log.debug("attaching dirty Building instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Building instance) {
		log.debug("attaching clean Building instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}