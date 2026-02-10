package hackerRank.WorldCodeSprint;


import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Link:https://www.hackerrank.com/contests/worldcodesprint/challenges/powerplants-in-flatland
 */
/**
 * Implementation of Flatland Space Stations algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FlatlandSpaceStations {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param ards[] the ards[] parameter
	 */
	public static void main(String ards[])
	{
		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		String inputLineArray[]=(scanner.nextLine().split(" "));
		int N=Integer.parseInt(inputLineArray[0]);
		int M=Integer.parseInt(inputLineArray[1]);
		if(N==M)
			System.out.println("0");
		else
		{
			String station[]=scanner.nextLine().split(" ");
			int index=0,max=Integer.MIN_VALUE;
			for (int i = 0; i < N; i++) {
				int currentCity=i;
				int dist=findNearestStation(currentCity,station);
				if(dist>max)
					max=dist;
			}
			System.out.println(max);
		}
	}

	/**
	 * Finds nearest station in the data structure.
	 *
	 * @param currentCity the currentCity parameter
	 * @param station the array to process
	 * @return the computed integer result
	 */
	private static int findNearestStation(int currentCity, String[] station) {
		int dist=Integer.MAX_VALUE;
		// Iterate through all elements
		for (int i = 0; i < station.length; i++) {
			int tempDist=Math.abs(currentCity-Integer.parseInt(station[i]));
			if(tempDist<dist)
				dist=tempDist;
		}
		return dist;
	}
}
