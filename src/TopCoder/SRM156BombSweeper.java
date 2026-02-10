package TopCoder;

/*
 * SRM 156 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1778&rd=4585
 */



/**
 * Implementation of SRM156 Bomb Sweeper algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM156BombSweeper {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(winPercentage(new String[]{".....",".....","..B..",".....","....."}));
		System.out.println(winPercentage(new String[]{"BBBBB","B...B","B...B","B...B","BBBBB"}));
		System.out.println(winPercentage(new String[]{".........",".B..B..B.",".........",
				".........",".B..B..B.",".........",".........",".B..B..B.","........."}));
		System.out.println(winPercentage(new String[]{".........................",".........................",
				".........................","........................."}));
		System.out.println(winPercentage(new String[]{"......B.......B..B...........................B....",
				"..............B..................BB..B............",
				"B.B.B.............B.....B..............B..........",
				"...................B...B....................BB....",
				"...B.....B.........................B.......B.....B",
				"B.B.........B.....B.......B..B......B.B...B.BB....",
				"..B...................BB...............B..........",
				".........B...B................B..B................",
				".......BB.......B....B................B.....BBB...",
				".......BB..........B..............B......BB.......",
				"...................BB.....................B.......",
				"...B.B.B......B..............B...B......B.........",
				"B................B................................",
				"....B..........B.....B..BB....B...............BB..",
				"..B....B.....B.............B.....B............B...",
				"...................B.B........B..B.........B.B....",
				".....B.....B......................................",
				"...........BB......BB...B.B........B...B..........",
				".....BBB..........................................",
				".B...........B....B...BB......B......B...B.B......",
				"..................B........BB................B....",
				"...............................B..B....BBB.B....B.",
				"..........B.......................................",
				".....B..........B....BB......B.B......B......B....",
				".....B..................B........B................",
				"............B.....B..B....BB...B....BB........B...",
				"..B.................B.........B...................",
				".BB..............B................................",
				"...B....B..................B.................B....",
				"......B...B......B......................B.B.......",
				"..............B..................B.......B........",
				".....B........BB...B.....B........................",
				".......B......B.B..B..........B...........B....B..",
				"B...B...........B...B...B......B.B...B..B......B..",
				"....B..B.....B.B.......BB..B............B.B....B..",
				"B.......B..........B.........B...B.BB......B......",
				"....B...............................B.............",
				".....B.B..........................................",
				"..........B............B......B.B..B....B.........",
				"....B...B.......................B.................",
				"B.................B...........B..B....B...........",
				"...B.....B........................................",
				"...B..B......................................BBB..",
				".B...B....................................B....B..",
				"...B...B..........B...B.B.........................",
				".....B.............B...BB..........B..BBB.BB......",
				"....................B.....B.......................",
				"........B..BB..........B.B....B...........B......B",
				".........B.....BB..B.............B....BB..........",
		"....B..B..............B...B..B..........B........."}));
		System.out.println(winPercentage(new String[]{"BBBB.B.BB..B....BB.B.BB..B.B....B..B"}));

	}
	/**
	 * Performs winPercentage operation.
	 *
	 * @param board the array to process
	 * @return the double result
	 */
	public static double winPercentage(String[] board){
		char[][] gridArray=new char[board.length][board[0].length()];
		// Iterate through all elements
		for (int i = 0; i < board.length; i++) {
			gridArray[i]=board[i].toCharArray();
		}
		int validPoints=0;
		int bombs=0;
		// Iterate through all elements
		for (int i = 0; i < gridArray.length; i++) {
			for (int j = 0; j < gridArray[0].length; j++) {
				if(gridArray[i][j]=='B')
				{
					bombs++;
				}
				else{
					validPoints+=checkPoint(gridArray,i,j);
				}
			}
		}
		return (validPoints*100)/(double)(validPoints+bombs);

	}
	/**
	 * Performs checkPoint operation.
	 *
	 * @param gridArray the array to process
	 * @param i the i parameter
	 * @param j the j parameter
	 * @return the computed integer result
	 */
	private static int checkPoint(char[][] gridArray, int i, int j) {
		int rows=gridArray.length;
		int cols=gridArray[0].length;
		if((i-1>-1 && j-1>-1 &&gridArray[i-1][j-1]=='B')||(i-1>-1 && gridArray[i-1][j]=='B')
				||(i-1>-1 && j+1<cols && gridArray[i-1][j+1]=='B')||(j-1>-1 && gridArray[i][j-1]=='B')
				||(j+1<cols && gridArray[i][j+1]=='B')||(i+1<rows && j-1 >-1 && gridArray[i+1][j-1]=='B')
				||(i+1<rows && gridArray[i+1][j]=='B')||(i+1<rows && j+1<cols && gridArray[i+1][j+1]=='B'))
			return 0;
		return 1;
	}
}
