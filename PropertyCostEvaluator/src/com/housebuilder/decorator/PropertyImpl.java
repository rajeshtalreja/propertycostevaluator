package com.housebuilder.decorator;
import java.util.List;

import com.housebuilder.amenities.Amenity;
import com.housebuilder.components.HouseBuilderComponent;
import com.housebuilder.housetypes.Property;
import com.housebuilder.utils.CollectionUtils;

/**
 * This is the property decorator. It is used to decorate a property with any
 * amenities at run time.
 * 
 * @author Rajesh
 *
 */
public class PropertyImpl implements Property {

	/**
	 * This represents the property
	 */
	private Property property;

	/**
	 * This represents the associated amenities
	 */
	private List<Amenity> amenities;

	/**
	 * This is used to create the PropertyImpl with property.
	 * 
	 * @param property
	 */
	public PropertyImpl(Property property) {
		this.property = property;
	}

	/**
	 * This is used to create the property with amenities.
	 * 
	 * @param property
	 * @param amenity
	 */
	public PropertyImpl(Property property, List<Amenity> amenity) {
		this.property = property;
		this.amenities = amenity;
	}

	@Override
	public String getDescription() {
		String toReturn = "Property : [ ";
		toReturn += property.getDescription();
		toReturn += " ]";
		if (CollectionUtils.isNotNullOrEmpty(amenities)) {
			for (Amenity amen : amenities) {
				toReturn += " , amenity [ " + amen.getDescription() + " ]";
			}
		}
		return toReturn;
	}

	@Override
	public Double getCost() {
		double cost = property.getCost();
		if (CollectionUtils.isNotNullOrEmpty(amenities)) {
			for (Amenity amen : amenities) {
				cost += amen.getCost();
			}
		}
		return cost;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public List<Amenity> getAmenities() {
		return amenities;
	}

	public void setAmenities(List<Amenity> amenities) {
		this.amenities = amenities;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return property.getType();
	}

}
