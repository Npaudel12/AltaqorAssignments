package altaqor.assignments.assignment24;
/*Note : Hash Map stores items in key/value pairs
 * HashMap<String, String> map = new HashMap<>();
 *         key       value
 * To add value: map.put("name", "narayan")
 * to get value : map. get(Key);
 * to check weather map contains key or not: map.conatinsValue(value) or map.containsKey(key)
 * 
 */
import java.util.HashMap;

//Write a program to declare and initialize a Map of strings and integers 
//and print its contents.
public class Question1 {

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
		
		//printing map
		System.out.println(map);
		
		// getting keys 
		for (String data : map.keySet()) {
			System.out.println(" Keys: " +  data + "\n");	
			
		}
		
		// getting values 
		
		for (String data : map.values()) {
			System.out.println(" Values : " +  data + "\n");	
		}
	
		// getting key and values together
		
		for (String data: map.keySet()) {
			System.out.println("Keys: " + data + "    Value: " + map.get(data));
			
		}
		

	}

}
