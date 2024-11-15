package map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<String, String> placesinChennai = new TreeMap<String, String>();
		placesinChennai.put("Pallavaram", "Chennai");
		placesinChennai.put("Marina", "Chennai");
		placesinChennai.put("Koyembedu", "Chennai");
		placesinChennai.put("Alandur", "Chennai");

		// if we try to add duplicate values, the value is overridden. last value can
		// see
		placesinChennai.put("Chennai", "Aadambakam");
		placesinChennai.put("Chennai", "Metro");

		System.out.println(placesinChennai);

		// method applicable for all methods from hash map includes below method

		// firstKey -Returns the first (lowest) key currently in this sorted map.

		String firstKeyvalue = placesinChennai.firstKey();
		System.out.println("First Key Value: " + firstKeyvalue);

		// headmap - The method returns a view of the portion of the map strictly less
		// than the parameter key_value.
		System.out.println(placesinChennai.headMap("Marina"));

		// lastKey - Returns the last (highest) key currently in this sorted map.
		String lastKeyValue = placesinChennai.lastKey();
		System.out.println("Last key Value :" + lastKeyValue);

		// SubMap - The method returns the portion of this map whose keys range from
		// startKey, inclusive, to endKey, exclusive.

		System.out.println("Sub map values :" + placesinChennai.subMap("Alandur", "Koyembedu"));

	}

}
