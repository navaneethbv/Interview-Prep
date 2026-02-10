package TopCoder;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * SRM 167 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1914&rd=4640
 */



/**
 * Implementation of SRM167 Animation algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM167Animation {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(animate(2,"..R....")));
		System.out.println(Arrays.toString(animate(3,"RR..LRL")));
		System.out.println(Arrays.toString(animate(2,"LRLR.LRLR")));
		System.out.println(Arrays.toString(animate(1,"...")));
		System.out.println(Arrays.toString(animate(10,"RLRLRLRLRL")));
		System.out.println(Arrays.toString(animate(1,"LRRL.LR.LRR.R.LRRL.")));
	}

	/**
	 * Performs animate operation.
	 *
	 * @param speed the speed parameter
	 * @param init the init parameter
	 * @return the resulting array
	 */
	public static String[] animate(int speed, String init){
		Boolean lArr[]=new Boolean[init.length()];
		Boolean rArr[]=new Boolean[init.length()];
		int lCounter=0,rCounter=0;
		Arrays.fill(lArr, false);
		Arrays.fill(rArr, false);
		// Iterate through all elements
		for (int i = 0; i < init.length(); i++) {
			if(init.charAt(i)=='L')
			{
				lArr[i]=true;
				lCounter++;
			}
			else if(init.charAt(i)=='R'){
				rArr[i]=true;
				rCounter++;
			}
		}
		ArrayList<String> aList=new ArrayList<>();
		StringBuilder sb=new StringBuilder();
		// Iterate through all elements
		for (int i = 0; i < rArr.length; i++) {
			if(lArr[i]||rArr[i])
				sb.append("X");
			else
				sb.append(".");
		}
		aList.add(sb.toString());
		while(lCounter>0 ||rCounter>0){
			if(lCounter>0){
				Boolean copyArr[]=Arrays.copyOf(lArr, lArr.length);
				// Iterate through all elements
				for (int i = 0; i < lArr.length; i++) {
					if(lArr[i] && i-speed>=0){
						copyArr[i]=false;
						copyArr[i-speed]=true;
					}
					else if(lArr[i] && i-speed<0){
						copyArr[i]=false;
						lCounter--;
					}
				}
				lArr=copyArr;
			}
			if(rCounter>0){
				Boolean copyArr[]=Arrays.copyOf(rArr, lArr.length);
				for (int i = rArr.length-1;i>=0;i--) {
					if(rArr[i] && i+speed<=rArr.length-1){
						copyArr[i]=false;
						copyArr[i+speed]=true;
					}
					else if(rArr[i] && i+speed>rArr.length-1){
						copyArr[i]=false;
						rCounter--;
					}
				}
				rArr=copyArr;
			}
			sb=new StringBuilder();
			// Iterate through all elements
			for (int i = 0; i < rArr.length; i++) {
				if(lArr[i]||rArr[i])
					sb.append("X");
				else
					sb.append(".");
			}
			aList.add(sb.toString());
		}
		String[] outputArr=new String[aList.size()];
		// Iterate through all elements
		for (int i = 0; i < outputArr.length; i++) {
			outputArr[i]=aList.get(i);
		}
		return outputArr;
	}
}
