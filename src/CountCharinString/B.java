package CountCharinString;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class B {

	   public static void main(String[] args) {
	        String inputString = "HelloworldHelloagainworld";

	        // Step 1: Split the input string into an array of words
	        char[] words = inputString.toCharArray();
	        // Step 2: Create a HashMap to store word frequency
	        HashMap<Character, Integer> wordCountMap = new HashMap<>();

	        // Step 3: Count the frequency of each word
	        for (char word : words) {
	            if (wordCountMap.containsKey(word)) {
	                // If the word is already present, increment its frequency
	                int count = wordCountMap.get(word);
	                wordCountMap.put(word, count + 1);
	             //   System.out.println(wordCountMap);
	            } else {
	                // If the word is encountered for the first time, add it to the HashMap with a frequency of 1
	                wordCountMap.put(word, 1);
	            }
	        }
	        
	  //   for(Entry<Character, Integer> e:wordCountMap.entrySet()) {
	     //  	System.out.println(e.getKey());
	      //  	System.out.println(e.getValue());
	        	
	       // }
	        // Step 4: Print the words and their frequencies
	  for (Character word : wordCountMap.keySet()) {
	           int frequency = wordCountMap.get(word);
	            System.out.println(word + " - " + frequency);
	       }
	       
	    
	   }}