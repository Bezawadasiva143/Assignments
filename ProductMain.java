package com.ey.jdbc.model;

import java.sql.Statement;
import java.sql.Connection;

public class ProductMain{


		Integer id;
		String name;
		Integer price;
	public	ProductMain(){
			
		}
	
		
		public ProductMain(Integer id, String name, Integer price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
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
		public Integer getprice() {
			return price;
		}
		public void setprice(Integer price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "productMain [id=" + id + ", name=" + name + ", price=" + price + "]";
		}

			
		
		
		
		
	}

