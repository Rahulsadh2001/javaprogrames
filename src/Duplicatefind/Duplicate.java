package Duplicatefind;

public class Duplicate {

	public static void main(String[] args) {
		String s="Teaaasting";
		int count =0;
		String[] spliting=s.split(s);
		for (int i=0;i<spliting.length;i++)
			if (spliting[i]==spliting[i+1]) {
				
					count++;
					System.out.println("found special char"+spliting[i]+count);} 

	
	
}
}