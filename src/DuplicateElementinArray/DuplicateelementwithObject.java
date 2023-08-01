package DuplicateElementinArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import CollectionSet.Set;

public class DuplicateelementwithObject {

	public static void main(String[] args) {
		int a=120;
		String b="rahul";
	    String c ="ram";
		String d="rahul";
		int e =130;
		List<Object> list=new ArrayList();
		list.add(a);
		list.add(b);

		list.add(c);
		list.add(d);
		list.add(e);
		
		HashSet<Object> obj=new HashSet();
		
		for(Object var:list)
			if(obj.add(var)==false){
				System.out.println("it is duplicate "+ var);
			}
			 
			 else if(obj.add(var)==true) {
					System.out.println("it is not duplicate "+ var);
				}}
			}

		


