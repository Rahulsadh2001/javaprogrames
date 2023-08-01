package SerachElementinArray;

import java.util.Scanner;

public class newele {

	public static void main(String[] args) {
		  boolean flag=false;

		    // creates an object of Scanner
		    Scanner input = new Scanner(System.in);

		    System.out.print("Enter the value: ");

		    // takes input from the keyboard
		    int name = input.nextInt();
		
			int arr[]= {20,45,45,67,78,78};
			 for(int i=0;i<arr.length;i++){    
		            if(arr[i] == name){    
		             System.out.println("value is found"+ name);   
		            }    
		        } }}