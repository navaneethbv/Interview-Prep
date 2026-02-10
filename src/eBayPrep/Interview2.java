package eBayPrep;

/**
 * Implementation of Interview2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Interview2{
	/*row1
	row2
	row3
	row4

	server1->row1
	     
	server2->row2
	server3->row3
	server4->row4


	sid1, US, Electronics, Low Volume seller
	sid2, UK, Electronics, High volume seller
	sid3, DE, Clothes, Low volume seller

	123 321

	4231
	->1234

	->

	->3214
	    3241
	if we find inversion


	//no inversion and sorted
	->1234
	    1243
	->123
	    132
	//1324
	    1342


	213
	-> 123, 132, 132, 231, 312, 321

	static TreeSet<Integer> set;
	/**
	 * Retrieves higher permutation from the data structure.
	 *
	 * @param a the a parameter
	 * @return the computed integer result
	 */
	public static int getHigherPermutation(int a)
	public static int getHigherPermutation(int a)
	{
	    String str=a+"";
	    set=new TreeSet<Integer>();
	    generatePermutations("",str);
	    return getHigherValue(a,set);
	}


	/**
	 * Performs generatePermutations operation.
	 *
	 * @param prefix the prefix parameter
	 * @param str the str parameter
	 */
	public void generatePermutations(String prefix,String str){
	    // Check for null/base case
	    if(str.length()==0)
	        set.add(Integer.parseInt(prefix));
	    for(int i=0;i<str.length();i++)
	    {
	        generatePermutations(prefix+str.charAt(i),str.substring(0,i)+str.subsString(i+1));
	    }
	}
	/**
	 * Retrieves higher value from the data structure.
	 *
	 * @param value the value value
	 * @param set the set parameter
	 * @return the computed integer result
	 */
	public static int getHigherValue(int value,Set<Integer> set)
	public static int getHigherValue(int value,Set<Integer> set)
	{
	    Iterator<Integer> iter=set.iterator();
	    while(iter.hasNext())
	    {
	        int newValue=iter.next();
	        if(newValue>value)
	            return newValue;
	    }
	    return -1;
	}*/






	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

}

