package TopCoder;

/*
 * SRM 687 Div2
 * Link:
 */



/**
 * Implementation of SRM687 Quacking algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM687Quacking {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(quack("quqacukqauackck"));
		System.out.println(quack("kcauq"));
		System.out.println(quack("quackquackquackquackquackquackquackquackquackquack"));
		System.out.println(quack("qqqqqqqqqquuuuuuuuuuaaaaaaaaaacccccccccckkkkkkkkkk"));
		System.out.println(quack("quqaquuacakcqckkuaquckqauckack"));
		System.out.println(quack("quackqauckquack"));
		System.out.println(quack("quackk"));
		
	}
	/**
	 * Performs quack operation.
	 *
	 * @param s the s parameter
	 * @return the computed integer result
	 */
	public static int quack(String s){
		if(s.length()%5!=0)
			return -1;
		int count=0;
		boolean arr[]=new boolean[s.length()];
		int numOfQs=0;
		String str=new String(s);
		char cArr[]=s.toCharArray();
		// Iterate through all elements
		for (int i = 0; i < cArr.length; i++) {
			if(cArr[i]=='q')
				numOfQs++;
		}
		char prevChar='z';
		int counter=0;
		for (int i = 0; i < numOfQs; i++) {
			prevChar='z';

			// Inner loop to check combinations
			for (int j = 0; j < s.length(); j++) {
				if(!arr[j]){
					if(prevChar=='z' && s.charAt(j)=='q')
					{	
						counter++;
						prevChar='q';
						arr[j]=true;
					}else if(prevChar=='k' && s.charAt(j)=='q')
					{
						counter++;
						prevChar='q';
						arr[j]=true;
					}else if(prevChar=='q' && s.charAt(j)=='u')
					{
						counter++;
						prevChar='u';
						arr[j]=true;
					}else if(prevChar=='u' && s.charAt(j)=='a')
					{
						counter++;
						prevChar='a';
						arr[j]=true;
					}else if(prevChar=='a' && s.charAt(j)=='c')
					{
						counter++;
						prevChar='c';
						arr[j]=true;
					}else if(prevChar=='c' && s.charAt(j)=='k')
					{
						counter++;
						prevChar='k';
						arr[j]=true;
					}
				}
			}
			if(prevChar=='k'){
				count++;
			}
			else if(prevChar!='k')
				return -1;
			if(counter==arr.length)
				break;
		}

		return prevChar=='k'?count:-1;
	}
}
