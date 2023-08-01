package ShortingInArray;

import java.util.Arrays;

public class Shortingarray {

	public static void main(String[] args) {
		int[] list= {9,2,4,5,7,1,3,6};
		int total=list.length;
		Arrays.sort(list);
		System.out.println(list[total-2]);
		int temp=0;
		for(int i=0;i<list.length;i++) {
			for(int j=i+1;j<list.length;j++) {
				if(list[i]>list[j]) {
					temp=list[i];
					list[i]=list[j];
					list[j]=temp;
					
				}
			}
		}
		System.out.println(list[total-2]);

	}

}
