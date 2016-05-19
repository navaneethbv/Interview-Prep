package Practice;

public class ReverseWordButNotSpecialCharacters {
	public void revWord(String str){		
		int flag=0;
		String word="";
		String finalString="";
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++){
			if(charArray[i]!=' '&&charArray[i]!=','&&!Character.isDigit(charArray[i])){				
				flag=1;
			}
			else if(flag==1&&(charArray[i]==' '||charArray[i]==','||Character.isDigit(charArray[i])))
				flag=2;
			if(flag==1&&i==str.length()-1){
				flag=2;
			}
			if(flag==1){
				word=word+charArray[i];
			}
			else if(flag==2){
				word= new StringBuffer(word).reverse().toString();
				finalString=finalString+word;
				flag=0;
				word="";
			}
			if(flag==0){System.out.println("final else");
				finalString=finalString+charArray[i];
			}
		}
		System.out.println(finalString);
	}
	public static void main(String args[]){
		ReverseWordButNotSpecialCharacters list1=new ReverseWordButNotSpecialCharacters();
		list1.revWord("I love, driving 5 cars");
	}
}
