package com.job_portal.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	private String email;
	private String password;
	private String role;
	
	public Profile getP() {
		return p;
	}
	public void setP(Profile p) {
		this.p = p;
	}
	// user <---->  Profile
	@OneToOne
	@JoinColumn(name="profile_id")
	private Profile p;
	
	// user<------>Applications(one user Many Applications)
	@OneToMany(mappedBy ="u")
	private List<Application> app;

}
