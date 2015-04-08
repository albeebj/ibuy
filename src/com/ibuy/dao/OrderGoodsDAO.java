package com.ibuy.dao;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.ibuy.bean.OrderGoods;

/**
 * A data access object (DAO) providing persistence and search support for
 * OrderGoods entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ibuy.bean.OrderGoods
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class OrderGoodsDAO {
	private static final Logger log = LoggerFactory
			.getLogger(OrderGoodsDAO.class);
	// property constants
	public static final String AMOUNT = "amount";
	public static final String GOODS_SIZE = "goodsSize";
	public static final String GOODS_COLOR = "goodsColor";
	public static final String STATUS = "status";

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(OrderGoods transientInstance) {
		log.debug("saving OrderGoods instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(OrderGoods persistentInstance) {
		log.debug("deleting OrderGoods instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OrderGoods findById(java.lang.Integer id) {
		log.debug("getting OrderGoods instance with id: " + id);
		try {
			OrderGoods instance = (OrderGoods) getCurrentSession().get(
					"com.ibuy.bean.OrderGoods", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(OrderGoods instance) {
		log.debug("finding OrderGoods instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.ibuy.bean.OrderGoods")
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
		log.debug("finding OrderGoods instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from OrderGoods as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAmount(Object amount) {
		return findByProperty(AMOUNT, amount);
	}

	public List findByGoodsSize(Object goodsSize) {
		return findByProperty(GOODS_SIZE, goodsSize);
	}

	public List findByGoodsColor(Object goodsColor) {
		return findByProperty(GOODS_COLOR, goodsColor);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findAll() {
		log.debug("finding all OrderGoods instances");
		try {
			String queryString = "from OrderGoods";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public OrderGoods merge(OrderGoods detachedInstance) {
		log.debug("merging OrderGoods instance");
		try {
			OrderGoods result = (OrderGoods) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(OrderGoods instance) {
		log.debug("attaching dirty OrderGoods instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OrderGoods instance) {
		log.debug("attaching clean OrderGoods instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static OrderGoodsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (OrderGoodsDAO) ctx.getBean("OrderGoodsDAO");
	}
}