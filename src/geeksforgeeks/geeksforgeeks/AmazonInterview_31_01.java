package geeksforgeeks;




/*
 * http://www.geeksforgeeks.org/amazon-interview-set-31/
 * a[] = {a,b,c,d,e} b[]={f,g,h} result should be = af+bg+ch+df+eg
 */;
/**
 * Implementation of Amazon Interview_31_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_31_01 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }

	 /**
	  * Retrieves sum from the data structure.
	  *
	  * @param a the array to process
	  * @param b the array to process
	  * @return the resulting string
	  */
	 private static String getSum(String[] a, String[] b) {
		 if(a.length>b.length)
			 // Recursively process left and right subtrees
			 return getSummation(a,b);
		 else
			 // Recursively process left and right subtrees
			 return getSummation(b,a);
	 }

	 /**
	  * Retrieves summation from the data structure.
	  *
	  * @param a the array to process
	  * @param b the array to process
	  * @return the resulting string
	  */
	 private static String getSummation(String[] a, String[] b) {
		 StringBuffer sb=new StringBuffer();
		 // Iterate through all elements
		 for (int i = 0; i < a.length; i++) {
			 sb.append(a[i]+b[i%b.length]+"+");
		 }
		 return sb.toString().substring(0,sb.toString().length()-1);
	 }
 }