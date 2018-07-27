package com.housebuilder.housetypes;


/**
 * This represents Bunglow type of properties.
 * @author Rajesh
 *
 */
public class Bunglow implements Property {

	private String description;
	
	private Double cost;
	
	private String type;
	
	@Override
	public String getDescription() {
		return "This is bunglow [ " + description + "]";
	}
	
	@Override
	public Double getCost() {
		return cost;
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
