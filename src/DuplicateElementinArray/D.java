package DuplicateElementinArray;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    String[] arry={"pankaj","rajiv","rahul","tlu","anita","rahul"};
    for (int i=0;i<arry.length;i++)
    {
    	 for (int j=i+1;j<arry.length;j++)
    	 {
    		if( arry[i]==arry[j]) {
    		
    	
    		System.out.println(arry[i]+" number is duplicate");
    	 }
    }
    
	}

}}
