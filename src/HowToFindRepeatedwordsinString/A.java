package HowToFindRepeatedwordsinString;

public class A {

	public static void main(String[] args) {
		
		String s= "Learn by rahul learn by rahul ";
		String[] r=s.split(" ");
		for (int i=0;i<s.length();i++) {
			int count =0;
			for (int j=i+1;i<s.length()+1;j++) {
				
				if(r[i].equals(r[j])) {
					count ++;
					r[j]="0";
					System.out.println("this word is repleated"+r[i]+ count +"times");
				}
			}
		}
		
		
		
	}

}
