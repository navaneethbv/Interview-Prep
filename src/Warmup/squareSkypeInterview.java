package Warmup;

import java.util.ArrayList;

/* 


HEY, I THINK I LOST YOU!
I'm GOING TO TRY CALLING BACK ON SKYPE







ABSOLUTE URL:
CURRENT: http://a.com/b/c/d.html
LINK:    https://b.com/e/f/g.html
RESULT:  https://b.com/e/f/g.html

ABSOLUTE PATH:
CURRENT: http://a.com/b/c/d.html
LINK:    /e/f/g.html
RESULT:  http://a.com/e/f/g.html

RELATIVE PATH:
CURRENT: http://a.com/b/c/d.html
LINK:    e/f/g.html
RESULT:  http://a.com/b/c/e/f/g.html

RELATIVE PATH #2:
CURRENT: http://a.com/b/c/d.html
LINK:    ../../e/f/g.html
RESULT:  http://a.com/e/f/g.html

RELATIVE PATH #3:
CURRENT: http://a.com/b/c/d.html
LINK:    ../../e/f/../g.html
RESULT:  http://a.com/e/g.html

SCHEME:  a-z characters followed by a ':'.
https:  http:   ftp:  gopher:  mailto:  abcdefg:

AUTHORITY:  '//' followed by non-'/' characters
//squareup.com  //localhost  //127.0.0.1:8080

PATH: everything else
/register/items/index.html  ../../e/f/g.html

 */

/**
 * Implementation of square Skype Interview algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class squareSkypeInterview {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Output 1 "+getRelativeURL("http://a.com/b/c/d.html", "https://b.com/e/f/g.html"));
		//https://b.com/e/f/g.html

		System.out.println("Output 2 "+getRelativeURL("http://a.com/b/c/d.html", "/e/f/g.html"));
		//http://a.com/e/f/g.html

		System.out.println("Output 3 "+getRelativeURL("http://a.com/b/c/d.html", "e/f/g.html"));
		// http://a.com/b/c/e/f/g.html
		//done

		System.out.println("Output 4 "+getRelativeURL("http://a.com/b/c/d.html", "../../e/f/g.html"));
		// http://a.com/e/f/g.html

		System.out.println("Output 5 "+getRelativeURL("http://a.com/b/c/d.html", "../../e/f/../g.html"));
		// http://a.com/e/g.html

		System.out.println("Output 6 "+getRelativeURL("http://a.com/b/c/d.html", "https://b.com/e/f:///g.html"));
		// https://b.com/e/f:///g.html

		System.out.println("Output 7 "+getRelativeURL("http://a.com/b/c/d.html", "/e/f:///g.html"));
		// http://a.com/e/f:///g.html


	}
	/**
	 * Retrieves relative url from the data structure.
	 *
	 * @param currentUrl the currentUrl parameter
	 * @param linkUrl the linkUrl parameter
	 * @return the resulting string
	 */
	private static String getRelativeURL(String currentUrl, String linkUrl) {
		String currUrlParts[]=currentUrl.split("://");
		String currUrlScheme=currUrlParts[0];
		String currUrlNotScheme=currUrlParts[1];
		String currUrlAuthParts[]=currUrlNotScheme.split("/");
		String currUrlAuthority=currUrlAuthParts[0];
		String currUrlHtml=currentUrl.split("/")[currentUrl.split("/").length-1];
		String linkUrlHtml=linkUrl.split("/")[linkUrl.split("/").length-1];
		String outputHtml=!currUrlHtml.contentEquals(linkUrlHtml)?linkUrlHtml:currUrlHtml;

		ArrayList<String> currUrlStrList=new ArrayList<>();
		for (int i = 1; i < currUrlAuthParts.length; i++) {
			currUrlStrList.add(currUrlAuthParts[i]);
		}

		String linkUrlParts[]=linkUrl.split("://");
		String linkUrlScheme=linkUrlParts[0];
		String outputScheme=getScheme(currUrlScheme, linkUrlScheme);
		String linkAuthority=getAuthority(currUrlAuthority, linkUrlParts);
		boolean hasAuthority=linkAuthority.contentEquals(currUrlAuthority);
		//System.out.println(Arrays.toString(linkUrlParts));
		if(linkUrl.startsWith("/"))
		{
			//case 2 and 7
		}
		else if(linkUrl.split("..").length>1)
		{
			//case 4 and 5
		}
		else if(hasAuthority)
		{
			//case 1 and 6
		}









		return "";
	}
	/**
	 * Retrieves authority from the data structure.
	 *
	 * @param currUrlAuthority the currUrlAuthority parameter
	 * @param linkUrlParts the array to process
	 * @return the resulting string
	 */
	private static String getAuthority(String currUrlAuthority, String[] linkUrlParts) {
		String linkAuthority;
		if(linkUrlParts.length>1 && !linkUrlParts[0].contains("/"))
		{
			linkAuthority=linkUrlParts[1].split("/")[0];	
			System.out.println("here");
		}
		else{
			linkAuthority=currUrlAuthority;
		}
		return linkAuthority;
	}
	/**
	 * Retrieves scheme from the data structure.
	 *
	 * @param currUrlScheme the currUrlScheme parameter
	 * @param linkUrlScheme the linkUrlScheme parameter
	 * @return the resulting string
	 */
	private static String getScheme(String currUrlScheme, String linkUrlScheme) {
		String outputScheme;
		if(linkUrlScheme.equals(currUrlScheme))
		{
			outputScheme=linkUrlScheme;
		}
		else{
			if(linkUrlScheme.contains("/"))
			{
				outputScheme=currUrlScheme;
			}
			else{
				outputScheme=linkUrlScheme;
			}
		}
		return outputScheme;
	}







	/**
	 * Performs whateverYouCallIt operation.
	 *
	 * @param currentURL the currentURL parameter
	 * @param linkURL the linkURL parameter
	 * @return the resulting string
	 */
	public static String whateverYouCallIt(String currentURL,String linkURL){
		// Check for null/base case
		if(linkURL.split("://")[0].length()>0 && linkURL.split("://")[0].indexOf("/")==-1){
			return linkURL;
		}
		// Check for null/base case
		else if(linkURL.split("/").length>0 && linkURL.charAt(0)=='/'){
			System.out.println("Output 2 "+whateverYouCallIt("http://a.com/b/c/d.html", "/e/f/g.html"));
			//http://a.com/e/f/g.html
			String outputString=currentURL.split("://")[0]+"://"+currentURL.split(":    //")[1].split("/")[0]+"/";
			System.out.println(currentURL.split("://")[1].split("/").length);
			for(int i=1;i<currentURL.split("://")[1].split("/").length-2;i++){
				outputString+=currentURL.split("://")[1].split("/")[i];
			}
			return outputString+linkURL;
		}
		else if(linkURL.charAt(0)!='/' && linkURL.charAt(0)!='.'){
			System.out.println("In case 3");
			String linkUrlArray[]=currentURL.split("/");
			String outputString="";
			for(int i=0;i<linkUrlArray.length-1;i++){
				outputString+=linkUrlArray[i]+"/";
			}
			outputString+=linkURL;
			return outputString;
		}
		return "TODO";
	}
}
