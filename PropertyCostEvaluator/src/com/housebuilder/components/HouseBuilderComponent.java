/**
 * 
 */
package com.housebuilder.components;

/**
 * This represents the components of house builder.
 * All Property or Amenities will be extending this interface as Property or Amenities are the components of the system.
 * 
 * @author Rajesh
 */
public interface HouseBuilderComponent {
	
	String getDescription();
	Double getCost();

}
