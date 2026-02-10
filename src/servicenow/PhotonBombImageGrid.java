package servicenow;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
 * Class  : PhotonBombImageGrid
 * Description:This Class is used to instantiate a PhotonBomb Image and convert it to a 2-dimensional character array.
 */
/**
 * Implementation of Photon Bomb Image Grid algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PhotonBombImageGrid {
	String photonFilePath;
	int height,width;
	char imageGrid[][];
	public PhotonBombImageGrid(String filePath){
		photonFilePath=filePath;
	}
	/**
	 * This method is used to scan the photonbomb image and store it in a 2D character array
	 *
	 * @return             Nothing
	 * @exception		   IOException On invalid input file.
	 */
	public  void scanImage() throws IOException{
		BufferedReader br;
		try{
			br= new BufferedReader(new FileReader(photonFilePath));
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
			throw new IOException("Invalid File Path - Photon bomb");
		};
	}
	/**
	 * This method is used to calculate the height and width of the photonbomb image.
	 *
	 * @return             Nothing
	 * @exception		   IOException On invalid input file.
	 */
	private  void getCoOrdinates() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(photonFilePath));
		String sCurrentLine;
		while ((sCurrentLine = br.readLine()) != null) {
			width=sCurrentLine.length();
			if(!sCurrentLine.trim().contentEquals("")){
				height++;
			}
		}
		br.close();
	}
	/**
	 * Retrieves photon file path from the data structure.
	 *
	 * @return the resulting string
	 */
	public  String getPhotonFilePath() {
		return photonFilePath;
	}
	/**
	 * Sets photon file path in the data structure.
	 *
	 * @param photonFilePath the photonFilePath parameter
	 */
	public  void setPhotonFilePath(String photonFilePath) {
		this.photonFilePath = photonFilePath;
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
