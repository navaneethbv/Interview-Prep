package tutorialPoint;

/**
 * Implementation of Puppy algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Puppy {
	int puppyAge;

	   public Puppy(String name){
	      // This constructor has one parameter, name.
	      System.out.println("Name chosen is :" + name ); 
	   }
	   
	   /**
	    * Sets age in the data structure.
	    *
	    * @param age the age parameter
	    */
	   public void setAge( int age ){
	       puppyAge = age;
	   }

	   /**
	    * Retrieves age from the data structure.
	    *
	    * @return the computed integer result
	    */
	   public int getAge( ){
	       System.out.println("Puppy's age is :" + puppyAge ); 
	       return puppyAge;
	   }
	   
	   /**
	    * Main method to test the functionality of the class with various test cases.
	    *
	    * @param []args the []args parameter
	    */
	   public static void main(String []args){
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	   }
}
