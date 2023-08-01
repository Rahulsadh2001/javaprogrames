
public class DuplicateArray {

	public static void main(String[] args) {
		
		String str = "Bbhahubali";
		int lenght = str.length();
		int count =0;
		char [] ch = str.toCharArray();
		for (int i=0; i<lenght; i++) {
			
			for (int j=i+1; j<lenght; j++) {
				
				if (ch[i]==ch[j]) {
					System.out.println("Duplicate charector are " +ch[j]);
					
					
				}
				
			}
			}}

}


