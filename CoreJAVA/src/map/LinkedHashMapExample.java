package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hash map and Linked Hash map both are same, only difference is In Linked Hash Map maintained Insertion order

		
	LinkedHashMap<String, String> heros= new LinkedHashMap<String, String>();
	
	heros.put("Iron Man", "Tony Stack");
	heros.put("Bat Man", "Bruce Wayne");
	heros.put("Super Man", "Clark");
	
	//Insertion of null key - it is allowing only one null key , if we are try to insert the value is overriden

	heros.put(null, null);
	heros.put(null, "Power star");
	
	System.out.println("Linked Hash Map :" +heros);
	
	
	
	HashMap<String, String> heros1= new HashMap<String, String>();
	
	heros1.put("Iron Man", "Tony Stack");
	heros1.put("Bat Man", "Bruce Wayne");
	heros1.put("Super Man", "Clark");
	
	//Insertion of null key - it is allowing only one null key , if we are try to insert the value is overriden

	heros1.put(null, null);
	heros1.put(null, "Power star");
	System.out.println("Hash Map :" +heros1);
	
	}

}
