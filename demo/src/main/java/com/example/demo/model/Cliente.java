package com.example.demo.model;

import javax.persistence.Entity;

public class Cliente {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int[] getBreeds() {
		return breeds;
	}
	public void setBreeds(int[] breeds) {
		this.breeds = breeds;
	}
	public int[] getCategories() {
		return categories;
	}
	public void setCategories(int[] categories) {
		this.categories = categories;
	}
	int id;
	String url;
	int breeds[];
	int categories[];
	
}
