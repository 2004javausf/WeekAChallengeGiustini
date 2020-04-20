package com.maurie.beans;

public class Cryptid {
	private String name;
	private String location;
	private String dangerLevel;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}

	public String getdangerLevel() {
		return dangerLevel;
	}
	
	public void setDangerLevel(String dangerLevel) {
		this.dangerLevel = dangerLevel;
	}

	@Override
	public String toString() {
		return "Cryptid [name=" + name + ", location=" + location + ", danger level=" + dangerLevel + "]";
	}
}
