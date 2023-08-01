package Alfabatics;

import java.util.ArrayList;
import java.util.List;

public class De {

	public static void main(String[] args) {
		int a=200;
		
		String d= "rahul";
		Boolean c = true;
		
		List<Object> list=new ArrayList();
		list.add(d);
		list.add(c);
		list.add(a);
		
		for (Object t:list) {
			System.out.println(t);
		}

	}

}
