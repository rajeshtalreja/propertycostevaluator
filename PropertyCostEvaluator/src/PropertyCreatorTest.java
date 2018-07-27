import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.housebuilder.amenities.Amenity;
import com.housebuilder.amenities.Door;
import com.housebuilder.amenities.Window;
import com.housebuilder.decorator.PropertyImpl;
import com.housebuilder.housetypes.Property;

public class PropertyCreatorTest {

	public static void main(String[] args) {

		
		//Here  I have used factory design pattern which is achieved by using spring framework to create the factory of different property and menities
		//Decorator patter is used to decorate the property with with different set of amenities.
		
		//This is the factory to get the different representation of 
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

		
		//There are two usecases that are represented here below
		//1. Property created with Property and amenities is retrieved from the factory
		
		//Here we get the property from the from the factory which is nothing but a normal 2BHK flat with amenities of one dooor and one window
		Property property = context.getBean("propertyImpl",Property.class);
		
		//The cost of 2BHK is 100000 and cost of one door is 300 and one window is 250. So ideally cost should be 100550
		System.out.println(property.getCost());
		
		//Here are the additional amenities that i want to add to the above created property. Decorating it additional door
		List<Amenity> amenities = new ArrayList<>();
		Door door = new Door();
		door.setDescription("New PVC door");
		door.setCost(200d);
		amenities.add(door);
		
		//Now create the property again with already created property with added amenities , so now cost should be 100550 + 200 = 100750
		property = new PropertyImpl(property,amenities);
		System.out.println(property.getCost());
		
		
		
		//This is another usecase. Create the normal 2BHK flat
		//Get the flat object , This is the normal 2BHK property
		Property property1 = (Property) context.getBean("flat2BHK"); 
		//The cost should be 100000
		System.out.println(property1.getCost());
		
		//Decorate it with one window only
		List<Amenity> amenities1 = new ArrayList<>();
		Window window = new Window();
		window.setCost(115d);
		amenities1.add(window);
		//Decorate the 2BHK flat with window , ideally cost should be 100000 + 115 = 100115
		property1 = new PropertyImpl(property1, amenities1);
		System.out.println(property1.getCost());

	}
}
