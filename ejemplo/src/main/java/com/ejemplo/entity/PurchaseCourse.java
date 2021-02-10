package com.ejemplo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchase_course")
public class PurchaseCourse {
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Id
	@Column(name="purchase")
	private Purchase purchase;
	
	@Id
	@Column(name="course")
	private Course course;
	
	@Id
	@Column(name="price")
	private double price;

	public PurchaseCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PurchaseCourse(Purchase purchase, Course course, double price) {
		super();
		this.purchase = purchase;
		this.course = course;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
