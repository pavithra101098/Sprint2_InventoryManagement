package com.capg.im.dao;

import java.util.Date;


import com.capg.im.entity.RawMaterialBean;

public interface ITrackOrderDao {
	//public RawMaterialBean trackOrder(String OrderId) ;
	//public boolean RawMaterialOrderIdExists(String Id);
	//public RawMaterialBean addDetails(RawMaterialBean bean);
	//public RawMaterialBean getDetails(int id);
	//public RawMaterialBean getmanufacturingDates(int id,Date manufacturingDate);
	//public RawMaterialBean getprocessingDate(int id,Date processingDate);
	public RawMaterialBean insertRawMaterials(RawMaterialBean bean);
	public RawMaterialBean getRawMaterials(int id);
	

}