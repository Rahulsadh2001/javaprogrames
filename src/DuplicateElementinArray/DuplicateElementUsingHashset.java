package DuplicateElementinArray;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementUsingHashset {

	public static void main(String[] args) {
		String[] arr= {"rahul","kullu","rahul"};
		
		Set<String> set=new HashSet<String>();
		for(String l:arr) {
			if(set.add(l)==false){
				System.out.println("it is duplicate "+ l);
			}
			 else if(set.add(l)==true) {
				System.out.println("it is not duplicate "+ l);
			}}
		}

	}


