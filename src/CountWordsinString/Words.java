package CountWordsinString;

public class Words {

	public static void main(String[] args) 
	{

		String w="rahul ko mummy dadti nhi hai";

		int total =w.length();
		int count=1;
		for(int i = 0;i<total;i++) {

			if((w.charAt(i)==' ')&& (w.charAt(i+1)!=' ') ){
				count++;

			}
		}

		System.out.println(count);
	}

}
