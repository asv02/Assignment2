package com.assignment.assignment.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="loads")
public class Load {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	@Column(name="loading_point")
    private String loadingPoint;
	@Column(name="unloading_point")
	private String unloadingPoint; 
	@Column(name="product_type")
	private String productType;
	@Column(name="truck_type")
	private String truckType;
	@Column(name="no_of_trucks")
	private int noOfTrucks;
	@Column(name="weight")
	private int weight;
	@Column(name="shipper_id")
	private String shipperId;
	@Column(name="date")
	private String Date;
//	 public Load(String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks,
//	 		int weight, String shipperId, String date) {
//	 	super();
//	 	this.loadingPoint = loadingPoint;
//	 	this.unloadingPoint = unloadingPoint;
//	 	this.productType = productType;
//	 	this.truckType = truckType;
//	 	this.noOfTrucks = noOfTrucks;
//	 	this.weight = weight;
//	 	this.shipperId = shipperId;
//	 	Date = date;
//	 }
//	 public Load() {
//	 	super();
//	 	// TODO Auto-generated constructor stub
//	 }
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getShipperId() {
		return shipperId;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "Load [loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint + ", productType="
				+ productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks + ", weight=" + weight
				 +  ", shipperId=" + shipperId + ", Date=" + Date + "]";
	}
	
}
