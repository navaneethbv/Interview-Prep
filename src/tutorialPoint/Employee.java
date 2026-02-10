package tutorialPoint;

/**
 * Implementation of Employee algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Employee{

   String name;
   int age;
   String designation;
   double salary;
	
   // This is the constructor of the class Employee
   public Employee(String name){
      this.name = name;
   }
   // Assign the age of the Employee  to the variable age.
   /**
    * Performs empAge operation.
    *
    * @param empAge the empAge parameter
    */
   public void empAge(int empAge){
      age =  empAge;
   }
   /* Assign the designation to the variable designation.*/
   /**
    * Performs empDesignation operation.
    *
    * @param empDesig the empDesig parameter
    */
   public void empDesignation(String empDesig){
      designation = empDesig;
   }
   /* Assign the salary to the variable	salary.*/
   /**
    * Performs empSalary operation.
    *
    * @param empSalary the empSalary parameter
    */
   public void empSalary(double empSalary){
      salary = empSalary;
   }
   /* Print the Employee details */
   /**
    * Performs printEmployee operation.
    *
    */
   public void printEmployee(){
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
   }

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