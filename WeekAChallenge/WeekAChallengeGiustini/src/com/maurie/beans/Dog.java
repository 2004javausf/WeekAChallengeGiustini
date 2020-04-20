package com.maurie.beans;

public class Dog {
	private String species;
	private String size;
	private String color;
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}

	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog [species=" + species + ", size=" + size + ", color=" + color + "]";
	}
}
