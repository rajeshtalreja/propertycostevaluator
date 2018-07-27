/**
 * 
 */
package com.housebuilder.utils;

import java.util.Collection;

/**
 * This class contains some utility methods.
 * @author Rajesh
 *
 */
public class CollectionUtils {
	
	/**
	 * This is used to check if collection is null or empty.
	 * @param collection - collection to check.
	 * @return true if collection is not null or empty.
	 */
	public static boolean isNotNullOrEmpty(Collection collection){
		
		if(collection != null && collection.size() > 0){
			return true;
		}
		return false;
	}

}
