package com.hibernate.mapping.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AadharCard {
	@Id
	private int id;
	
	private long aadharNumber;
	
	private String address;
	
	private String state;
	
	private String dateOfBirth;
	
	public AadharCard() {
		
	}
	public AadharCard(int id,long aadharNumber,String address,String state,String dateOfBirth) {
		this.id=id;
		
		this.aadharNumber=aadharNumber;
		
		this.address=address;
		
		this.state=state;
		
		this.dateOfBirth=dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	

}
