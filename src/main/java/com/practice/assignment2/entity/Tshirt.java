package com.practice.assignment2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Tshirt {
	
	@Id
	private String id;
	private String name;
	private String color;
	private String gender_rec;
	private String size;
	private double price;
	private double rating;
	private String availability;
	
	@Transient
	private String out_pref;  
	
	public Tshirt(String id, String name, String color, String gender_rec, String size, double price, double rating,
			String availability) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.gender_rec = gender_rec;
		this.size = size;
		this.price = price;
		this.rating = rating;
		this.availability = availability;
		
	}
	
	
	public String getId() {
		return id;
	}
	public String getOut_pref() {
		return out_pref;
	}
	public void setOut_pref(String out_pref) {
		this.out_pref = out_pref;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getGender_rec() {
		return gender_rec;
	}
	public void setGender_rec(String gender_rec) {
		this.gender_rec = gender_rec;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	public Tshirt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tshirt(String color, String gender_rec, String size, String out_pref) {
		super();
		this.color = color;
		this.gender_rec = gender_rec;
		this.size = size;
		this.out_pref = out_pref;
	}
	@Override
	public String toString() {
		return "Tshirt [id=" + id + ", name=" + name + ", color=" + color + ", gender_rec=" + gender_rec + ", size="
				+ size + ", price=" + price + ", rating=" + rating + ", availability=" + availability + ", out_pref="
				+ out_pref + "]";
	}

	
}
