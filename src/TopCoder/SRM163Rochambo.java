package TopCoder;

/*
 * SRM 163 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1810&rd=4620
 */



/**
 * Implementation of SRM163 Rochambo algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM163Rochambo {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(wins("PS"));
		System.out.println(wins("PSRRPS"));
		System.out.println(wins("PSRPSRPRSR"));
		System.out.println(wins("SRPSRPSPRSPRPSRPSRP"));
		System.out.println(wins("RPPPRRPSSSRRRSRSPPSSPRRPSRRRRSPPPPSSPSSSSSRSSSRPRR"));
	}
	/**
	 * Performs wins operation.
	 *
	 * @param opponent the opponent parameter
	 * @return the computed integer result
	 */
	public static int wins(String opponent){
		int noOfWins=0;
		StringBuilder myBets=new StringBuilder("RR");
		// Iterate through all elements
		for (int i = 0; i < opponent.length(); i++) {
			if(i<=1)
			{
				noOfWins+=checkWin(myBets.charAt(i),opponent.charAt(i));
			}
			else{
				noOfWins+=checkWin(findWinner(predict(opponent.substring(i-2,i))),opponent.charAt(i));
			}
		}
		return noOfWins;

	}
	/**
	 * Finds winner in the data structure.
	 *
	 * @param predict the predict parameter
	 * @return the char result
	 */
	private static char findWinner(char predict) {
		if(predict=='R')
			return 'P';
		else if(predict=='P')
			return 'S';
		else 
			return 'R';	
	}
	/**
	 * Performs predict operation.
	 *
	 * @param substring the substring parameter
	 * @return the char result
	 */
	private static char predict(String substring) {
		// Check for null/base case
		if(substring.charAt(0)==substring.charAt(1))
			return substring.charAt(0);
		else{
			if(substring.indexOf('R')!=-1 && substring.indexOf('P')!=-1){
				return 'S';
			}else if(substring.indexOf('R')!=-1 && substring.indexOf('S')!=-1){
				return 'P';
			}else{//PS
				return 'R';
			}
		}
	}
	/**
	 * Performs checkWin operation.
	 *
	 * @param myBet the myBet parameter
	 * @param opponentBet the opponentBet parameter
	 * @return the computed integer result
	 */
	private static int checkWin(char myBet, char opponentBet) {
		if((myBet=='R' && opponentBet=='S')||(myBet=='S' && opponentBet=='P')||(myBet=='P' && opponentBet=='R'))
			return 1;
		return 0;
	}

}
