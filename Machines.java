package com.example.demo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Machines")
public class Machines {
	
	@Id
	String id;
	String name;
	int leasePrice;
	String catagory;
	String vendor;
	int inventory;
	List<Tags> tags;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeasePrice() {
		return leasePrice;
	}
	public void setLeasePrice(int leasePrice) {
		this.leasePrice = leasePrice;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public List<Tags> getTags() {
		return tags;
	}
	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}
	
	public Machines(String name, int leasePrice, String catagory, String vendor, int inventory,
			List<Tags> tags) {

		this.name = name;
		this.leasePrice = leasePrice;
		this.catagory = catagory;
		this.vendor = vendor;
		this.inventory = inventory;
		this.tags = tags;
	}

}
