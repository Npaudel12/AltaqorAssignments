package altaqor.assignments.assignment24;

import java.util.HashMap;

//Write a program to check whether a key exists in a Map of strings and integers.

public class Question3 {

	public static void main(String[] args) {
		// HashMap
		HashMap<String, Integer> map = new HashMap<>();
		
		// adding value in map
		
		map.put("Ganesh", 22);
		map.put("Ram", 33);
		map.put("Bibek", 20);
		map.put("Binam", 14);
		
		int size = map.size();
		System.out.println("Size of map: " + size);
		
		System.out.println("Contains of the map:" + map);
		
		// checking weather Ram exist in map or not
		
		System.out.println("\n Check weather  key Ram  exit or not ");
		if(map.containsKey("Ram")){
			System.out.println(" Yes, it is present in the map");
			
		}else {
			System.out.println(" No, it is not  present in the map");
		}
		
		
		
	}

}
