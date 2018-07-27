package com.housebuilder.housetypes;

import com.housebuilder.components.HouseBuilderComponent;

/**
 * This represents the property. Each property exihibits two important behavior i.e. description and cost from the component and can have their own property as well like type of property.
 * @author Rajesh
 *
 */
public interface Property extends HouseBuilderComponent {
	
	String getType();
	
}
