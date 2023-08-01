package CountCharinString;

public class CountCharectorvalues {
	   public static void main(String[] args) {
		   
		   
		   String s="Rahul Sadh";
		 int count =0;
		  
		   for (int i=0;i<s.length();i++)
			   
		   { if (s.charAt(i)=='a') {
			  
			   count++;
		   }
			   
			   
		   } System.out.println("found:  "+ count + " times");
	   }
}
