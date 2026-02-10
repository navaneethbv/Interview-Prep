package ctci;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*Implementation of LFU Page Replacement Algorithm
 *Assuming arrival time array to be sorted
 */
/**
 * Implementation of SRT Scheduling Pre Emptive algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRTSchedulingPreEmptive{

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		Integer noOfProcesses=Integer.parseInt(scanner.nextLine());
		int arrivalTimeArray[]=new int[noOfProcesses];
		int serviceTimeArray[]=new int[noOfProcesses];
		String arrivalTimeStringArray[]={"0","2","4","6","8"};//scanner.nextLine().split(",");
		String serviceTimeStringArray[]={"3","6","4","5","2"};//scanner.nextLine().split(",");
		scanner.close();
		for (int i = 0; i < noOfProcesses; i++) {
			arrivalTimeArray[i]=Integer.parseInt(arrivalTimeStringArray[i]);
			serviceTimeArray[i]=Integer.parseInt(serviceTimeStringArray[i]);
		}
		float[] outputList=srtScheduler(arrivalTimeArray,serviceTimeArray);
		System.out.println(Arrays.toString(outputList));
	}

	/**
	 * Performs srtScheduler operation.
	 *
	 * @param arrivalTimeArray the array to process
	 * @param serviceTimeArray the array to process
	 * @return the resulting array
	 */
	private static float[] srtScheduler(int[] arrivalTimeArray, int[] serviceTimeArray) {
		int[] remainingTimeArray=new int[arrivalTimeArray.length];
		Arrays.fill(remainingTimeArray,0);
		int[] finishTimeArray=new int[arrivalTimeArray.length];
		int totalServiceTime=0;
		// Iterate through all elements
		for (int i = 0; i < serviceTimeArray.length; i++) {
			totalServiceTime+=serviceTimeArray[i];
		}
		int count=0;
		boolean newProcess=false;
		int index=0;
		for (int i = 0; i < totalServiceTime; i++) {
			if(arrivalTimeArray[count]==i)
			{	
				remainingTimeArray[count]=serviceTimeArray[count];
				if(count!=arrivalTimeArray.length-1)	{
					count++;
					int processIndex=findMinimumArrayIndex(0, remainingTimeArray);
					if(processIndex==(count-1))
						newProcess=true;
				}
			}
			// Check for null/base case
			if(newProcess||remainingTimeArray[index]==0){
				if(remainingTimeArray[index]==0)
					finishTimeArray[index]=i;


				index=findMinimumArrayIndex(0,remainingTimeArray);
				newProcess=false;
			}
			remainingTimeArray[index]--;
		}
		finishTimeArray[index]=totalServiceTime;
		int[] turnAroundTimeArray=new int[arrivalTimeArray.length];
		float[] outputArray=new float[arrivalTimeArray.length];

		// Iterate through all elements
		for (int i = 0; i < turnAroundTimeArray.length; i++) {
			turnAroundTimeArray[i]=finishTimeArray[i]-arrivalTimeArray[i];
			outputArray[i]=(float)turnAroundTimeArray[i]/serviceTimeArray[i];
		}
		return outputArray;
	}

	/**
	 * Finds minimum array index in the data structure.
	 *
	 * @param i the i parameter
	 * @param remArray the array to process
	 * @return the computed integer result
	 */
	private static int findMinimumArrayIndex(int i,int[] remArray) {
		int index=0,min=Integer.MAX_VALUE;
		for (int j = i; j <remArray.length; j++) {
			if(remArray[j]<min && remArray[j]>0){
				index=j;
				min=remArray[j];
			}
		}
		return index;
	}
}