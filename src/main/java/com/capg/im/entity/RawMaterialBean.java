package com.capg.im.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RawMaterials")
public class RawMaterialBean {
 
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int orderId;
	String name;
	//String supplierId;
	double quantityValue;
	String quantityUnit;
	Date dateOfOrder;
	Date dateOfDelivery;
	Date manufacturingDate;
	Date processingDate;
	double pricePerUnit;
	double totalPrice;
	//String deliveryStatus;
	String wareouseId;
 
	public int getOrderId() {
		return orderId;
		}

		public void setOrderId(int orderId) {
		this.orderId = orderId;
		}

		public String getName() {
		return name;
		}

		public void setName(String name) {
		this.name = name;
		}
		public double getQuantityValue() {
			return quantityValue;
			}

			public void setQuantityValue(double quantityValue) {
			this.quantityValue = quantityValue;
			}

			public String getQuantityUnit() {
			return quantityUnit;
			}

			public void setQuantityUnit(String quantityUnit) {
			this.quantityUnit = quantityUnit;
			}

			public Date getDateOfOrder() {
			return dateOfOrder;
			}

			public void setDateOfOrder(Date dateOfOrder) {
			this.dateOfOrder = dateOfOrder;
			}
			public Date getManufacturingDate() {
				return manufacturingDate;
			}
			public void setManufacturingDate(Date manufacturingDate) {
				this.manufacturingDate = manufacturingDate;
			}
			public Date getProcessingDate() {
				return processingDate;
			}
			public void setProcessingDate(Date processingDate) {
				this.processingDate = processingDate;
			}
			
			public Date getDateOfDelivery() {
			return dateOfDelivery;
			}

			public void setDateOfDelivery(Date dateOfDelivery) {
			this.dateOfDelivery = dateOfDelivery;
			}

			public double getPricePerUnit() {
			return pricePerUnit;
			}

			public void setPricePerUnit(double pricePerUnit) {
			this.pricePerUnit = pricePerUnit;
			}

			public double getTotalPrice() {
			return totalPrice;
			}

			public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
			}

			/*
			* public String getDeliveryStatus() { return deliveryStatus; }
			*
			* public void setDeliveryStatus(String deliveryStatus) { this.deliveryStatus =
			* deliveryStatus; }
			*/

			public String getWareouseId() {
			return wareouseId;
			}

			public void setWareouseId(String wareouseId) {
			this.wareouseId = wareouseId;
			}


			@Override
			public String toString() {
			return "RawMaterialOrder OrderId=" + orderId + "\n" + " Name=" + name+"\n" +
			"QuantityValue=" + quantityValue + "\n" +
			" QuantityUnit=" + quantityUnit + "\n"+""+ "DateOfOrder=" + dateOfOrder+"\n"+
			" DateOfDelivery=" + dateOfDelivery + "\n" +""
			+ " PricePerUnit=" + pricePerUnit + "\n"+"TotalPrice=" + totalPrice
			+ "\n"+" WareouseId=" + wareouseId ;
			}
			}

	

