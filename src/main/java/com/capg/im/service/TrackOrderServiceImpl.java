package com.capg.im.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.capg.bank.dao.IBankDao;
//import com.capg.bank.entity.BankBean;
import com.capg.im.dao.ITrackOrderDao;
import com.capg.im.entity.RawMaterialBean;

@Service
public class TrackOrderServiceImpl implements ITrackOrderService{
	@Autowired
	ITrackOrderDao dao;
	/** @author pavithra :
	 * This insertRawMaterials method will 
	 * insert details into the entity **/
	@Override
	public RawMaterialBean insertRawMaterials(RawMaterialBean bean) {
		return dao.insertRawMaterials(bean);
	}
	/** @author pavithra :
	 * This getRawMaterials method will
	 *  retrieve the details(object) of rawmaterials present 
	 * in particular id
	 **/
	@Override
	public RawMaterialBean getRawMaterials(int id) {
		return dao.getRawMaterials(id);
	}

}
