package geeksforgeeks;









/*
 * http://www.geeksforgeeks.org/amazon-interview-set-24/
 * http://www.geeksforgeeks.org/find-two-rectangles-overlap/
 * Rectangle overlap problem
 */;
/**
 * Implementation of Amazon Interview_24_02 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_24_02 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }

	 private static boolean checkOverlap(String l1, String r1, String l2,
			 String r2) {
		 String splitArray[]=l1.split(",");
		 int lTX1=Integer.parseInt(splitArray[0]);
		 int lTY1=Integer.parseInt(splitArray[1]);
		 splitArray=r1.split(",");
		 int rBX1=Integer.parseInt(splitArray[0]);
		 int rBY1=Integer.parseInt(splitArray[1]);
		 splitArray=l2.split(",");
		 int lTX2=Integer.parseInt(splitArray[0]);
		 int lTY2=Integer.parseInt(splitArray[1]);
		 splitArray=r2.split(",");
		 int rBX2=Integer.parseInt(splitArray[0]);
		 int rBY2=Integer.parseInt(splitArray[1]);

		 if((lTX2)>=lTX1 && (lTX2)<=(rBX1))
		 {
			 if((rBY2)<=lTY1 && (rBY2)>=(rBY1))
			 {
				 return true;
			 }
			 if((lTY2)<=lTY1 && (lTY2)>=(rBY1))
			 {
				 return true;
			 }
		 }


		 if((rBX2)>=lTX1 && (rBX2)<=(rBX1))
		 {
			 if((rBY2)<=lTY1 && (rBY2)>=(rBY1))
			 {
				 return true;
			 }
			 if((lTY2)<=lTY1 && (lTY2)>=(rBY1))
			 {
				 return true;
			 }
		 }
		 return false;
	 }

 }