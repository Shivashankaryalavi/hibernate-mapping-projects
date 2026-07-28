package com.job_portal.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Skill {
	@Id
	private int id;
	
	private String name;
	
	@ManyToMany(mappedBy="s")
	private List<Job> j;

}
