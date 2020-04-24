package com.capg.im.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
//import com.capg.bank.entity.BankBean;
//import com.capg.bank.entity.History;
//import com.capg.bank.entity.BankBean;
import com.capg.im.entity.RawMaterialBean;

//import com.capg.im.dao.ITrackOrderDao;

@Repository
@Transactional
public class TrackOrderDaoImpl implements ITrackOrderDao{
	@PersistenceContext
	EntityManager em;
	/** @author pavithra :
	 * This insertRawMaterials method will 
	 * insert details into the entity of rawmaterialbean **/
	@Override
	public RawMaterialBean insertRawMaterials(RawMaterialBean bean) {
		
		 em.persist(bean);
		 
		 return bean;
		 
	}
	/** @author pavithra :
	 * This getRawMaterials method will
	 *  retrieve the details(object) of rawmaterials present 
	 * in particular id
	 **/
	@Override
	public RawMaterialBean getRawMaterials(int id) {
		
		return em.find(RawMaterialBean.class, id);
	}
	
}
