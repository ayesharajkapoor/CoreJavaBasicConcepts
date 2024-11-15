package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public void basicHashsetmethods() {
		HashSet<String> hsset= new HashSet<String>();
		hsset.add("A");
		hsset.add("B");
		hsset.add("C");
		hsset.add("A");
		hsset.add("B");
		hsset.add("D");
		hsset.add("F");
		hsset.add(null);
		//Duplicates are not allowed and Insertion order is not maintained
		System.out.println("Contents of the hash set :" +hsset); 
		hsset.remove(null);
		System.out.println("Contents of the hash set after removing null:" +hsset);
		System.out.println("To check D present in this set:" +hsset.contains("D"));
		
	}

	public void hashsetusingIterator() {
		HashSet<String> hsset1= new HashSet<String>();
		hsset1.add("A");
		hsset1.add("B");
		hsset1.add("C");
		hsset1.add("A");
		hsset1.add("B");
		hsset1.add("D");
		hsset1.add("F");
		hsset1.add(null);
		Iterator<String> hashiterator= hsset1.iterator();
		while(hashiterator.hasNext()) {
			System.out.println("Hashset using iterator: " +hashiterator.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetExample hs= new HashSetExample();
		hs.basicHashsetmethods();
		hs.hashsetusingIterator();

	}

}
