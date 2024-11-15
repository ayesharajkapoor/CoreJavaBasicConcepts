package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	
	public void linkedhashsetExplanation() {
		
		LinkedHashSet LHS= new LinkedHashSet(); //generics are not used
		LHS.add("1");
		LHS.add("ab");
		LHS.add("C");
		LHS.add(null);
		LHS.add("d");
		System.out.println("Insertion order preserved in linked hash set :" +LHS);
		System.out.println("The size of linked hash set is: "+LHS.size());
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSetExample ex=new LinkedHashSetExample();
		ex.linkedhashsetExplanation();

	}

}
