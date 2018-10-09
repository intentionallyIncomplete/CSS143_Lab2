package Part3thru5;

/** 
 * @author Ian Bryan
 * @version 1.0
 * Lab 2 for CSS 143 Lab
 */

public class IntList {
	
	/*
	 * Variable Declaration
	 * Integer array (data) - Used to index up to 100 integer values
	 * Integer array (data) - private access modifier
	 * Integer (numElements) - Counter for number of indices
	 * */
	private int[] data = new int[100];
	private int numElements = 0;

	public static void main(String[] args) {
		IntList a = new IntList();
		a.add(95);
		a.add(100);
		a.add(58);
		System.out.println(a.toString() );
		System.out.println(a.sum() );
		System.out.println(a.indexOf(100)); //uncomment these to work on next
		System.out.println(a.indexOf(20));
		//System.out.println(a.save() );

	}
	
	/** METHODS */
	
	/*
	 * add() - Adds value "n" to the array in order of index. 
	 * Uses parameter to take in value assigned in main()
	 * */
	public void add(int n) {
		//I saw something similar to this when working on the FractionsV1 assignment
		//I thought this was very cool and really like the simplicity.
		//Since the numElements variable is an integer, it can be used to reference an index.
		//The index referred to at the time is one greater than where the numElements value was before it was 
		//executed the previous time.
		data[numElements++] = n;
	}
	
	/*
	 * sum() - Simply iterates over occupied indices and sums them.
	 * The loops only includes the indices with values which is determinded by the numElements value
	 * */
	public int sum(){
		int sumOfArray = 0;
		for(int i=0;i<numElements;i++){
			sumOfArray += data[i];
		}
		return sumOfArray;
	}

	/* 
	 * indexOf() - Used to find a specific value within the list of indices
	 * The 'target' is searched for by going through the entire index (for probability of failure to decrease)
	 * and is checked against each value passed over.
	 * */
	public int indexOf(int target){
		for (int i=0; i<data.length; i++)
		{
			//if the current index value is the same as the specified one, return that index.
			if (data[i] == target){
				return i;
			}
		}
		return -1; //if not found, return this as a signal marker
	}
	
	/*
	 * toString() - Overloaded method with no parameter in the method signature
	 * Only returns a String with the value of the indices distributed to console
	 * and appended with a comma.
	 * */
	public String toString() {
		String retVal = "";
		for(int i=0;i<numElements;i++) {
			retVal += data[i] + ",";
		}
		//The parameters for substring(arg1,arg2) are to remove the extra comma at the end
		return retVal.substring(0,retVal.length()-1);
	}
}
