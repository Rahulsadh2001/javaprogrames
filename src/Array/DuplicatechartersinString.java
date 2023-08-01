package Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicatechartersinString {

	public static void main(String[] args) {
	String s="Raaabbhul";
	int count =1;
	Set<Character> duplicatenum=new HashSet<>();
	char [] array=s.toCharArray();
	for(char c : array ) {
		if(!duplicatenum.add(c)) {
	
		System.out.println(c);
		}
	}System.out.println( "value is duplicate "+ count+ " times");


	}

}
