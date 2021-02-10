package com.ejemplo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_has_course")
public class UserHasCourse {

	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="course_id")
	private Course course_id;
	
	@Column(name="user_person_id")
	private UserPerson user_person_id;

	public UserHasCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserHasCourse(Course course_id, UserPerson user_person_id) {
		super();
		this.course_id = course_id;
		this.user_person_id = user_person_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Course getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Course course_id) {
		this.course_id = course_id;
	}

	public UserPerson getUser_person_id() {
		return user_person_id;
	}

	public void setUser_person_id(UserPerson user_person_id) {
		this.user_person_id = user_person_id;
	}
	
}
