package SecondLargestValue;

public class A {

	public static void main(String[] args) {
		int a[]={1,2,5,3,6,2};  // TODO Auto-generated method stub
              int total=a.length;
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   //6>3
		                {  
		                    temp = a[i];  //temp=6;
		                    a[i] = a[j];  //a[i]=3;
		                    a[j] = temp;  //a[j]=6;
		                }  
		            }  
		        }  System.out.println(a[total-2]);
		       
		}  
		  

	}


