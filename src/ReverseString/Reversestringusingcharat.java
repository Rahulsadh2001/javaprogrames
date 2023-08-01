package ReverseString;

public class Reversestringusingcharat {

	public static void main(String[] args) {
		String s = "rahul sadh";
		int count =0;
		int size =s.length();
		for ( int i=size-1;i>=0; i--) {
			if (s.charAt(i)!=' ') {
			System.out.println(s.charAt(i));
			count ++;
		}
			}
		System.out.println("total number of charector " + count);
	}

}
