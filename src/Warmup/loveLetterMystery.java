package Warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Implementation of love Letter Mystery algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class loveLetterMystery {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args)  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			Integer noOfTestCases=Integer.parseInt(br.readLine());
			String str="";
			for (int i = 0; i < noOfTestCases; i++) {
				int count=0;
				str=br.readLine();
				int posEnd=str.length()-1;
				for (int j = 0; j < str.length(); j++) {
					if(j>posEnd){
						break;
					}
					if(str.charAt(j)!=str.charAt(posEnd)){
						/*System.out.println("asd");
						}
						else{*/
						/*while(str.charAt(j)!=str.charAt(posEnd)){

							}*/
						int x=((int)str.charAt(j)-(int)str.charAt(posEnd));
						if(x<0){
							x=-x;
						}
						count+=x;
					}
					posEnd--;
				}
				System.out.println(count);
			}

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
