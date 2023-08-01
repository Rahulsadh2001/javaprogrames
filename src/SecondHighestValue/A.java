package SecondHighestValue;

import java.util.Arrays;

public class A {

	public static void main(String[] args) {

int [] arr= {2,3,4,5,5,56,6,67,77,89};

int max =arr[0];
for(int i=1;i<=arr.length-1;i++) {
if (arr[i]>max) {
	
	max=arr[i];
	
}

	}System.out.println(max);
}

}
