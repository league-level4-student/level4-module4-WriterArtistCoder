package _01_introduction_to_encapsulation;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

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
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; //can be any object type except String. Strings get turned into objects.
	
	public static void main(String[] args) {
		EncapsulateTheData e = new EncapsulateTheData();
		e.test();
	}
	
	@Test
	public void test() {
		EncapsulateTheData x = new EncapsulateTheData();
		x.setItemsReceived(-2);
		assertEquals(x.getItemsReceived(), 0);
		
		x.setDegreesTurned(-2);
		assertEquals(x.getDegreesTurned(), 0, 0.99);
		
		x.setNomenclature("");
		assertEquals(x.getNomenclature(), " ");
		
		x.setMemberObj("hello");
		assertFalse( x.getMemberObj().equals(x.getMemberObj().toString()) );
	}
	
	public int getItemsReceived() {
		return itemsReceived;
	}
	
	public void setItemsReceived(int i) {
		itemsReceived = Math.max(0, i);
	}
	
	public float getDegreesTurned() {
		return degreesTurned;
	}
	
	public void setDegreesTurned(float f) {
		degreesTurned = (float) Math.max(0, Math.min(360, f));
	}
	
	public String getNomenclature() {
		return nomenclature;
	}
	

	public void setNomenclature(String s) {
		if (s.isEmpty()) {
			s = " ";
		}
		
		nomenclature = s;
	}
	
	public Object getMemberObj() {
		return memberObj;
	}
	
	public void setMemberObj(Object o) {
		if (o.equals(o.toString())) {
			o = new Object();
		}
		
		memberObj = o;
	}
}
