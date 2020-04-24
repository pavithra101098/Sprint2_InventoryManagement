package com.capg.im.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import com.capg.bank.entity.BankBean;
//import com.capg.bank.entity.BankBean;
//import com.capg.bank.entity.BankBean;
import com.capg.im.entity.RawMaterialBean;
//import com.capg.bank.service.BankServiceImpl;
import com.capg.im.service.TrackOrderServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TrackOrderRestController {
	@Autowired
	TrackOrderServiceImpl tsi;

	@PostMapping("/rawmaterial/insert")
	/**
	 * @author pavithra : This insertRawMaterials method will insert details into
	 *         the entity of rawmaterialbean
	 **/
	public String insertRawMaterials(@RequestBody RawMaterialBean bean) {
		RawMaterialBean rawmaterialbean = tsi.insertRawMaterials(bean);
		return "Hello " + rawmaterialbean.getName() + rawmaterialbean.getPricePerUnit()
				+ rawmaterialbean.getQuantityUnit() + "\n Your Insertion is Successfull\n" + "Your Account Id is "
				+ rawmaterialbean.getOrderId();
	}

	/**
	 * @author pavithra : This getRawMaterials method will retrieve the
	 *         details(object) of rawmaterials present in particular id
	 **/
	@GetMapping(value = "/rawmaterial/getRawMaterials/{id}", produces = "application/text")
	public String getRawMaterials(@PathVariable int id) throws Exception {

		RawMaterialBean rawmaterialbean = tsi.getRawMaterials(id);

		if (rawmaterialbean == null) {
			throw new Exception("Invalid id");
		}
		return "Your Account details are " + rawmaterialbean.toString();
	}
	/*
	 * @GetMapping("/bank/findall") //GET: http://localhost:8090/bank/findall public
	 * List<RawMaterialBean> getall() {
	 * 
	 * List<RawMaterialBean> bean = rawmaterialbean.g; return bean; }
	 */
}
