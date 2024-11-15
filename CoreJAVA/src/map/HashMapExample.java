
package map;

import java.util.HashMap;


public class HashMapExample {
	
	public void HashMapMethodExplanations() {
		//Creation
	HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
	//put method- to insert the element
	
	employeeMap.put(1, "Agni");
	employeeMap.put(2, "Riya");
	employeeMap.put(3, "Arya");
	employeeMap.put(4, "Munima");
	employeeMap.put(5, "Duck");
	System.out.println("Employee Map :" + employeeMap);
	
	//putall - duplicate copy of map
	
	HashMap<Integer, String> duplicateMap = new HashMap<Integer, String>();
	duplicateMap.putAll(employeeMap);
	System.out.println("Duplicate Map:" +duplicateMap);
	//clear
	
	duplicateMap.clear();
	System.out.println("After Clearing :" +duplicateMap);
	
	//containsKey
	System.out.println("Does this map has key 5 ? : " +employeeMap.containsKey(5));
	
	//containsValue
	
	System.out.println("Does this map has value 'Duck'" +employeeMap.containsValue("Duck"));
	
	
	//Clone
	System.out.println("Cloned Map:" +employeeMap.clone());
	
	//IsEmpty
	
	System.out.println("Is Empty?" +duplicateMap.isEmpty());
	
	//Keyset - return set of keys
	System.out.println("Key Set : " +employeeMap.keySet());
	
	//get(key)
	System.out.println(employeeMap.get(4));
	
	//Values - fetch the all values
	System.out.println("All Values:" +employeeMap.values());
	
	//Entry set - it returns set of key and value 
	System.out.println(employeeMap.entrySet());
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapExample hsmap= new HashMapExample();
		hsmap.HashMapMethodExplanations();

	}

}
