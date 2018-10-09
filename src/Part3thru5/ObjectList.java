package Part3thru5;

/** 
 * @author Ian Bryan
 * @version 1.0
 * Lab 2 for CSS 143 Lab
 */

public class ObjectList {
	
	/*
	 * Variable Declaration
	 * Integer array (data) - Used to index up to 100 integer values
	 * Integer array (data) - private access modifier
	 * Integer (numElements) - Counter for number of indices
	 * */
	private Object[] myShapes = new Object[100];
	private int numElements = 0;

	public static void main(String[] args) {
		ObjectList a = new ObjectList();
		a.add(95);
		a.add(100);
		a.add(58);
		System.out.println(a.toString());

	}
	
	/** METHODS */
	
	/*
	 * add() - Similar to the method in IntList, the only change is
	 * to the parameter's data type which is now an Object.
	 * */
	public void add(Object n) {
		//I saw something similar to this when working on the FractionsV1 assignment
		//I thought this was very cool and really like the simplicity.
		//Since the numElements variable is an integer, it can be used to reference an index.
		//The index referred to at the time is one greater than where the numElements value was before it was 
		//executed the previous time.
		myShapes[numElements++] = n;
	}
	
	/*
	 * toString() - Overloaded method with no parameter in the method signature
	 * Only returns a String with the value of the indices distributed to console
	 * and appended with a comma.
	 * */
	public String toString() {
		String retVal = "";
		for(int i=0;i<numElements;i++) {
			retVal += myShapes[i] + ",";
		}
		//The parameters for substring(arg1,arg2) are to remove the extra comma at the end
		return retVal.substring(0,retVal.length()-1);
	}
}
