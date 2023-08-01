package CountCharinString;

public class A {

	public static void main(String[] args) {
		String s= "Java is objected oriented program langauage";
		
		String[] words=s.split(" ");
		int count=0;
		for(int i=0;i<words.length+1;i++) {
			for(int j=i+1;i<words.length;j++)
			if(s.charAt(i)==s.charAt(j)) {
				
				count++;
			}System.out.println("word"+s.charAt(i)+"is repeated"+count+"times");
		}
	}

}
