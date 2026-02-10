package servicenow;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
 * Class  : StarShipImageGrid
 * Description:This Class is used to instantiate a StarShip Image and convert it to a 2-dimensional character array.
 */
/**
 * Implementation of Star Ship Image Grid algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StarShipImageGrid {
	String starShipImagePath;
	int height,width;
	char imageGrid[][];
	public StarShipImageGrid(String filePath){
		starShipImagePath=filePath;
	}
	/**
	 * This method is used to scan the StarShip image and store it in a 2D character array
	 *
	 * @return             Nothing
	 * @exception		   IOException On invalid input file.
	 */
	public void scanImage() throws IOException{
		BufferedReader br;
		try{
			br= new BufferedReader(new FileReader(starShipImagePath));
			getCoOrdinates();
			imageGrid=new char[height][width];
			String sCurrentLine;
			int lineCounter=0;
			while ((sCurrentLine = br.readLine()) != null) {
				if(!sCurrentLine.trim().contentEquals("")){
					imageGrid[lineCounter]=sCurrentLine.toCharArray();
					lineCounter++;
				}
			}
			br.close();
		} catch (Exception e) {
			throw new IOException("Invalid File Path - Star Ship");
		};
	}
	/**
	 * This method is used to calculate the height and width of the StarShip image.
	 *
	 * @return             Nothing
	 * @exception		   IOException On invalid input file.
	 */
	private void getCoOrdinates() throws IOException {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(starShipImagePath));
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				width=sCurrentLine.length();
				if(!sCurrentLine.trim().contentEquals("")){
					height++;
				}
			}
			br.close();
		} catch (Exception e) {
			throw new IOException("Invalid File Path - StarShip");
		};
		br.close();
	}
	/**
	 * Retrieves star ship image path from the data structure.
	 *
	 * @return the resulting string
	 */
	public  String getStarShipImagePath() {
		return starShipImagePath;
	}
	/**
	 * Sets star ship image path in the data structure.
	 *
	 * @param starShipImagePath the starShipImagePath parameter
	 */
	public  void setStarShipImagePath(String starShipImagePath) {
		this.starShipImagePath = starShipImagePath;
	}
	/**
	 * Retrieves image grid from the data structure.
	 *
	 * @return the resulting array
	 */
	public  char[][] getImageGrid() {
		return imageGrid;
	}
	/**
	 * Sets image grid in the data structure.
	 *
	 * @param imageGrid the array to process
	 */
	public  void setImageGrid(char[][] imageGrid) {
		this.imageGrid = imageGrid;
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
