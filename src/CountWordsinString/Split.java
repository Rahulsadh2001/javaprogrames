package CountWordsinString;

public class Split {

	public static void main(String[] args) {
String w="rahul ko mummy dadti nhi hai";
		
		int total =w.length();
	String[] a=w.split("//s");
		for(int i = 0;i<total-1;i++) {
System.out.println(a[i]);
	}

}}
