package com.maurie.beans;

public class Cat {
	private String species;
	private String coatPattern;
	private String color;
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}

	public String getCoatPattern() {
		return coatPattern;
	}
	
	public void setCoatPattern(String coatPattern) {
		this.coatPattern = coatPattern;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat [species=" + species + ", coat pattern=" + coatPattern + ", color=" + color + "]";
	}
	
	
	
}
