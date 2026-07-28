package com.job_portal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Application {

	@Id
	private int id;
	private String appliedDate;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAppliedDate() {
		return appliedDate;
	}
	public void setAppliedDate(String appliedDate) {
		this.appliedDate = appliedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}

	@ManyToOne
	@JoinColumn(name="user_id")
	private User u;
	
	@ManyToOne
	@JoinColumn(name="job_id")
	private Job j;
	

	
}
