package com.ejemplo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="level")
public class Level {
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="level")
	private String level;

	public Level() {
		super();
	}

	public Level(String level) {
		super();
		this.level = level;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	

}
