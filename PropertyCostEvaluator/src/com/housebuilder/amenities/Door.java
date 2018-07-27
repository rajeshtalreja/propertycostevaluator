package com.housebuilder.amenities;

public class Door implements Amenity {

	private String description;

	private Double cost;
	
	private String type;

	@Override
	public String getDescription() {
		return "This is shop [ " + description + "]";
	}

	@Override
	public Double getCost() {
		return cost;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
