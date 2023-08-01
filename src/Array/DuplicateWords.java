package Array;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a= {"rahul","pulkit","tlu","rahul","pulkit","tlu"};
		int count =1;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) {


				//	
					count++;
					System.out.println("this is duplicate "+a[i]);
				}
			}

		}

	}}
