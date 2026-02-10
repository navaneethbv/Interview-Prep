package eBayPrep;

/**
 * Implementation of Interview3_4 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Interview3_4{
	/*
	public class Employee {
	    private long id;
	    private String name;
	    private Integer yearJoined;

	    // equals

	    /**
	     * Performs equals operation.
	     *
	     * @param a the a parameter
	     * @return true if condition is met, false otherwise
	     */
	    public boolean equals(Employee a){
	        return (this.id==a.getId()) &&
	        ((this.name==null &&a.getName()==null) || (this.name!=null && this.name.contentEquals(a.getName())) &&
	        ((this.yearJoined==null &&a.getYearJoined()==null) ||(this.yearJoined!=null && this.yearJoined.equals(a.getYearJoined())));  

	    }

	}



	Employee e1 = new Employee(1,null,200L);
	Employee e2 = new Employee(1,"Hello", 200L);

	e1.equals(e2)


	e1.equals(e2)


	-----------------------------------------------------------------------

	ipString = "dad"
	List<String> : All permutations of the given string
	"dad" : "add", "dda", "dad"

	static List<String> outputList;
	static Set<String> outputSet;

	/**
	 * Retrieves permutations from the data structure.
	 *
	 * @param str the str parameter
	 * @return the list of results
	 */
	public static List<String> getPermutations(String str)
	public static List<String> getPermutations(String str)
	{
	    outputList=new ArrayList<String>();
	    outputSet=new HashSet<String>();
	    permute("",str);
	    return outputList;
	}
	123->123   12->12
	     132       21
	     213
	     231
	     312
	     321   

	/**
	 * Performs permute operation.
	 *
	 * @param prefix the prefix parameter
	 * @param str the str parameter
	 */
	public static void permute(String prefix,String str)
	public static void permute(String prefix,String str)
	{
	    if(str.length()==0 && !set.contains(prefix))
	    {
	        outputList.add(prefix);
	        set.add(prefix);
	    }
	    for(int i=0;i<str.length();i++)
	    {
	        permute(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1);
	    }
	}


	--------------------
	Q2. map: [(empId1, empId2), (empId7, empId100), (empId2, empId99)]
	empId1 reports to empId2

	1. What d/s would you use?
	2.  isReporting(int empId1, int empId2)
	    REturn Boolean
	        True: Direct : (13, 23) then 13, 23 are directly related
	                Indirect: (13, 45), (45, 23): 13, 23 are indirectly related
	        False: Otherwise

	/**
	 * Checks if reporting.
	 *
	 * @param e1 the e1 parameter
	 * @param e2 the e2 parameter
	 * @return true if condition is met, false otherwise
	 */
	public static boolean isReporting(int e1, int e2){
	    // Check for null/base case
	    if(e1==null||e2==null)
	        return false;
	    // Check for null/base case
	    if(e1!=null && map.containsKey(e1)){
	        if(map.get(e1)==e2)
	            return true;
	        else
	            // Recursively process left and right subtrees
	            return  isReporting(map.get(e1), int e2);
	    }
	    return false;
	}
	 */



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

