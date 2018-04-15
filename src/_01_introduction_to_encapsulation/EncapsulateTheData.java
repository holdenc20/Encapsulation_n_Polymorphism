package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.platform.commons.util.StringUtils;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */
	

public class EncapsulateTheData {
	public static void itemsSetter(int x) {
		if(x>0) {
		itemsRecieved=x;
		}
		else {
			itemsRecieved=0;
		}
	}
	public static void degreesSetter(float x) {
		if(x>=0 && 360>=x) {
		degreesTurned=x;
		}
	}
	public static void namenSetter(String x) {
		if(x.equals("")) {
			x=" ";
		}
		else {
		nomenclature=x;
		}
	}
	public static void objectSetter(Object x) {
		try {
			if(x.getClass()==Class.forName("String")) {
			}
		
			else {
				memberObj=x;
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int itemsGetter() {
		return itemsRecieved;
	}
	public static float degreesGetter() {
		return degreesTurned;
	}
	public static String namenGetter() {
		return nomenclature;
	}
	public static Object objectGetter() {
		return memberObj;
	}
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private static int itemsRecieved; //must not be negative. All negative arguments get set to 0.
	private static float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private static String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private static Object memberObj; //can be any object type except String. Strings get turned into objects.
	
	public static void main(String[] args) {
		itemsSetter(1);
		assertEquals(itemsGetter(), 1);
	}
}
