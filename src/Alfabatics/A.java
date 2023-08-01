package Alfabatics;

import java.util.ArrayList;
import java.util.List;

public class A {

	public static void main(String[] args) {
	int a=200;
	
	String d= "rahul";
	Boolean c = true;
	
	 String newboolean = Boolean.toString(true);
	 String integertostring=Integer.toString(a);
	 
	 List<String> list=new ArrayList();
	 list.add(d);
	 list.add(newboolean);
	 list.add(integertostring);
	 
	 for(String s:list) {
		 System.out.println(s);
	 }
	}

}
