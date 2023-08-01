package ObjectClass;

import java.util.ArrayList;
import java.util.List;

public class A {

	public static void main(String[] args) {
		
		int a=20;
		String b="rahul";
		Boolean c =true;
		List<Object> obj=new ArrayList<Object>();
		
          obj.add(b);
          obj.add(a);
          obj.add(c);
          System.out.println(obj);
          System.out.println( obj.contains(b));
          List<String> t=new ArrayList<String>();
        
          String d= Integer.toString(a);
        String e=Boolean.toString(true);
          t.add(b);
          t.add(d);
          t.add(e);
          System.out.println(t);
          
	}

}
