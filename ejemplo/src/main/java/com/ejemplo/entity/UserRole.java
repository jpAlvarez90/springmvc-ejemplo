package com.ejemplo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_role")
public class UserRole {

	@Id
	@Column(name="id")
	private Long id;
	
	@Id
	@Column(name="role_id")
	private Role role_id;
	
	@Id
	@Column(name="user_person_id")
	private UserPerson user_person_id;

	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRole(Role role_id, UserPerson user_person_id) {
		super();
		this.role_id = role_id;
		this.user_person_id = user_person_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Role getRole_id() {
		return role_id;
	}

	public void setRole_id(Role role_id) {
		this.role_id = role_id;
	}

	public UserPerson getUser_person_id() {
		return user_person_id;
	}

	public void setUser_person_id(UserPerson user_person_id) {
		this.user_person_id = user_person_id;
	}
	
}
