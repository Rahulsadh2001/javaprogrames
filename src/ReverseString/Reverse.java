package ReverseString;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Reverse string by java";
		
   //Splits a string into an array of substrings
		
	String str[]=	s.split("");
	
		for (int i=str.length-1  ;i>=0;i--) {
			
			System.out.println(str[i]);
		}
	}

}
