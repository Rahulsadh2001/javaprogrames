import java.util.ArrayList;
import java.util.List;

public class Mulipledatatypestore {

	public static void main(String[] args) {
		
		        List<Object> myList = new ArrayList<>(); // create a list that can store any Object type
		        
		        // add elements to the list
		        myList.add("Hello"); // String value
		        myList.add(42); // Integer value
		        myList.add(true); // Boolean value
		        
		        // access and print elements in the list
		        System.out.println("First element: " + myList.get(0));
		        System.out.println("Second element: " + myList.get(1));
		        System.out.println("Third element: " + myList.get(2));
		    }

	

}
