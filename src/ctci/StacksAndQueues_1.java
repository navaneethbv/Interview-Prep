package ctci;

import java.io.InputStreamReader;
import java.util.Scanner;

/*Implementation of CTCI 3.1*/
/**
 * Implementation of Stacks And Queues_1 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StacksAndQueues_1 {
	private static int mainArray[];
	private static int firstStackMin,firstStackMax;
	private static int secondStackMin,secondStackMax;
	private static int thirdStackMin,thirdStackMax;
	private static int firstStackPointer,secondStackPointer,thirdStackPointer;
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner =new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter Array Size");
		int mainArraySize=Integer.parseInt(scanner.nextLine());
		mainArray=new int[mainArraySize];
		firstStackMin=0;
		firstStackMax=(int)Math.floor(mainArraySize/3);
		secondStackMin=(int)(Math.floor(mainArraySize/3)+1);
		secondStackMax=(int)(Math.floor(2*mainArraySize/3));
		thirdStackMin=(int)(Math.floor(2*mainArraySize/3)+1);
		thirdStackMax=mainArraySize-1;
		firstStackPointer=firstStackMin;
		secondStackPointer=secondStackMin;
		thirdStackPointer=thirdStackMin;
		String scannedLine="";
		System.out.println("Enter -0 to Exit");
		System.out.println("Enter inputs in the following format");
		System.out.println("StackNumber InputValue PUSH/POP");
		while(!(scannedLine=scanner.nextLine()).contentEquals("-0")){

			String inputArray[]=scannedLine.split(" ");
			if(inputArray[0].contentEquals("1"))
			{
				if(inputArray[2].contentEquals("PUSH")){
					System.out.println("Push to first stack ? "+firstPush(Integer.parseInt(inputArray[1])));
				}
				else{
					System.out.println("Popped Out Value : "+firstPop());
				}
			}
			else if(inputArray[0].contentEquals("2"))
			{
				if(inputArray[2].contentEquals("PUSH")){
					System.out.println("Push to second stack ? "+secondPush(Integer.parseInt(inputArray[1])));
				}
				else{
					System.out.println("Popped Out Value : "+secondPop());
				}
			}
			else if(inputArray[0].contentEquals("3"))
			{
				if(inputArray[2].contentEquals("PUSH")){
					System.out.println("Push to third stack ? "+thirdPush(Integer.parseInt(inputArray[1])));
				}
				else{
					System.out.println("Popped Out Value : "+thirdPop());
				}
			}
			System.out.println("StackNumber InputValue PUSH/POP");
		}
		scanner.close();
		System.out.println("Exited");
	}
	/**
	 * Performs firstPush operation.
	 *
	 * @param value the value value
	 * @return true if condition is met, false otherwise
	 */
	public static boolean firstPush(int value){
		if(firstStackPointer>=firstStackMin-1 && firstStackPointer<=firstStackMax){
			mainArray[firstStackPointer]=value;
			firstStackPointer++;
			return true;
		}
		return false;
	}
	/**
	 * Performs firstPop operation.
	 *
	 * @return the computed integer result
	 */
	public static int firstPop(){
		if(firstStackPointer>=firstStackMin && firstStackPointer<=firstStackMax){
			firstStackPointer--;
			return mainArray[firstStackPointer];
		}
		else
			return -2147483648;
	}
	/**
	 * Performs secondPush operation.
	 *
	 * @param value the value value
	 * @return true if condition is met, false otherwise
	 */
	public static boolean secondPush(int value){
		if(secondStackPointer>=secondStackMin-1 && secondStackPointer<=secondStackMax){
			mainArray[secondStackPointer]=value;
			secondStackPointer++;
			return true;
		}
		return false;
	}
	/**
	 * Performs secondPop operation.
	 *
	 * @return the computed integer result
	 */
	public static int secondPop(){
		if(secondStackPointer>=secondStackMin && secondStackPointer<=secondStackMax){
			secondStackPointer--;
			return mainArray[secondStackPointer];
		}
		else
			return -2147483648;
	}
	/**
	 * Performs thirdPush operation.
	 *
	 * @param value the value value
	 * @return true if condition is met, false otherwise
	 */
	public static boolean thirdPush(int value){
		if(thirdStackPointer>=thirdStackMin-1 && thirdStackPointer<=thirdStackMax){
			mainArray[thirdStackPointer]=value;
			thirdStackPointer++;
			return true;
		}
		return false;
	}
	/**
	 * Performs thirdPop operation.
	 *
	 * @return the computed integer result
	 */
	public static int thirdPop(){
		if(thirdStackPointer>=thirdStackMin && thirdStackPointer<=thirdStackMax){
			thirdStackPointer--;
			return mainArray[thirdStackPointer];
		}
		else
			return -2147483648;
	}
}
