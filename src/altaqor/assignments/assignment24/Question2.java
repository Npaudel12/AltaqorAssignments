package altaqor.assignments.assignment24;
//Write a program to find the value associated with a specific key 
//in a Map of strings and strings.
import java.util.HashMap;

public class Question2 {

	public static void main(String[] args) {
		//HashMap
				HashMap<String, String> map = new HashMap<>();
				
				//adding data to map
				map.put("Name", "Narayan Paudel");
				map.put("Address", "3124 S 69th Ave");
				map.put("State", "NE");
				map.put("City", "Omaha");
				map.put("Zipcode", "68001");
				
				//size
				System.out.println("Size of map: " + map.size());
				
				// getting value using key
				String value = map.get("Address");
				System.out.println("Value for key Address: " + value);
	}

}
