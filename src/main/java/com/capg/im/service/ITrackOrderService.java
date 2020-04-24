package com.capg.im.service;

import java.util.Date;

import com.capg.im.entity.RawMaterialBean;

public interface ITrackOrderService {
	
	//public RawMaterialBean trackOrder(String OrderId) ;
	//public boolean RawMaterialOrderIdExists(String Id);
	public RawMaterialBean insertRawMaterials(RawMaterialBean bean);
	public RawMaterialBean getRawMaterials(int id);
	//public RawMaterialBean getmanufacturingDates(int id,Date manufacturingDate);
	//public RawMaterialBean getprocessingDate(int id,Date processingDate);
	
	//public ProductDetails ProductOrder(String ProductId) throws ProductOrderNotFoundException;
}

