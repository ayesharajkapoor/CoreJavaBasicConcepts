package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	
	public void arraylist() {
		List<String> arrayList= new ArrayList<String>(); //Dynamic polymorphism
		//to add the elements in arraylist
		arrayList.add("Bentley");
		arrayList.add("Benz");
		arrayList.add("BMW");
		arrayList.add("Bugatti");
		arrayList.add("Bugatti");
		System.out.println(arrayList);
		//retrive the element from arraylist
		System.out.println(arrayList.get(1));
		//It returns the index of the first and last occurence of the specified elemet
		System.out.println(arrayList.indexOf("Benz"));
		System.out.println(arrayList.lastIndexOf("Bugatti"));
		//if specified element is not there, it returns -1
		System.out.println(arrayList.indexOf("Indica"));
		//creating another list
		List<String> anotherList=new ArrayList<String>();
		//add all the elements from one list to another list
		anotherList.addAll(arrayList);
		System.out.println(anotherList);
		//clear all the elements in the list
		anotherList.clear();
		System.out.println(anotherList);
		//remove the element using index and object value
		arrayList.remove(0);
		arrayList.remove("Bugatti");
		System.out.println(arrayList);
		// we can insert null also in array list
		arrayList.add(null);
		System.out.println(arrayList);
		//we can update element value
		arrayList.set(0, "Indica");
		System.out.println(arrayList);
		//to check arraylist is empty or not
		System.out.println(arrayList.isEmpty());
		System.out.println(anotherList.isEmpty());
		
		//iterate
		//using for each
		for (String string : arrayList) {
			System.out.println("Using for each loop:" +string);
			
		}
		//using for loop
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Using for loop:" + arrayList.get(i));
		}
		// using list iterator
		//forward traversing
		ListIterator<String> list_iterator=arrayList.listIterator();
		while(list_iterator.hasNext()) {
			System.out.println("Using List iterator Forward Traversing:" +list_iterator.next());
		}
		while(list_iterator.hasPrevious()) {
			System.out.println("Using List iterator Backward Traversing :" +list_iterator.previous());
		}
		
		// using Iterator
		Iterator<String> iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println("Using iterator:" +iterator.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListExample a1= new ArrayListExample();
		a1.arraylist();

	}

}
