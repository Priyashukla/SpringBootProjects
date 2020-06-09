package com.crudproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//it makes class entity bean with protected scope no argument constructor
@Entity
public class product {
	     //@Id annotation will automatically determine the most appropriate primary key
	     //@GeneratedValue which generator type to use makes your code portable between different databases
	     @Id
         @GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		private String name;
		private String brand;
		private String madein;
		private String price;
		
		//getter and setter
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getMadein() {
			return madein;
		}
		public void setMadein(String madein) {
			this.madein = madein;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		//default constructor
		public product() {
			super();
		}

	   

}
