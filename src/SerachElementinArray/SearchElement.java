package SerachElementinArray;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           boolean flag=false;
		
		int arr[]= {20,45,45,67,78,78};
		int ele=30;
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i]==ele) {
				System.out.println("value is found" +i);
				flag=true;
				break;
			}
		}
		
	} 
	}

