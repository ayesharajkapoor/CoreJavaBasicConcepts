package collections;

import java.security.PublicKey;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public void LinkedListMethodExample() {

		LinkedList<Integer> LL = new LinkedList<Integer>();
		LL.add(2);
		LL.add(3);
		LL.add(4);
		System.out.println("The Linked List values are: " + LL);

		// Add an element to the first position
		LL.addFirst(1);
		System.out.println("Linked List after adding element at first:" + LL);
		// Add an element to the last position
		LL.addLast(5);
		System.out.println("Linked list after adding element at last : " + LL);

		System.out.println("The First Value in Linked List : " + LL.getFirst());
		System.out.println("The First value using index in Linked List :" + LL.get(0));
		// removefirst  and removelast
		System.out.println("Remove First : " +LL.removeFirst());
		System.out.println("Remove Last : " +LL.removeLast());
		System.out.println("The Linked list after done removefirst and remove last :" +LL);
		//poll and pollFirst- it deletes first elements in the linked list
		System.out.println("The poll method:" +LL.poll());
		//pollLast - it deletes the last elements in the linked list
		System.out.println("ThePollLast method:" +LL.pollLast());
		System.out.println("The Linked List after done poll and polllast: " +LL);
		//remove - it deletes the first element in the list
		System.out.println("The remove:" +LL.remove());
		System.out.println("The Linked List after remove method done : " +LL);
		
		//adding some elements in LL since it is empty
		LL.add(3);
		LL.add(2);
		LL.add(3);
		LL.add(4);
		LL.add(5);
		LL.add(4);
		LL.add(6);
		System.out.println(LL);
		//removeFirstOccurence
		LL.removeFirstOccurrence(3);
		System.out.println("After done removefirst Occurence: "  +LL);
		//removeLastOccurence
		LL.removeLastOccurrence(4);
		System.out.println("After done remove last occurence :" +LL);
		
		
		
	}
	public void LLusingFor() {
		LinkedList<Integer> LL1= new LinkedList<Integer>();
		LL1.add(5);
		LL1.add(4);
		LL1.add(3);
		LL1.add(2);
		LL1.add(1);
		System.out.println("-----------------------------------");
		for(int i=0;i<LL1.size();i++) {
						System.out.println("Using normal For loop :" +LL1.get(i));
		}
		
	}
	
	public void LLusingForeach() {
		LinkedList<String> LL2= new LinkedList<String>();
		LL2.add("a");
		LL2.add("b");
		LL2.add("c");
		LL2.add("d");
		LL2.add("e");
		System.out.println("-----------------------------------");
		for (String string : LL2) {
			
			System.out.println("Using Advance For each loop :" +string);
			
		}
	}
	public void LLusingwhile() {
		LinkedList<String> LL3= new LinkedList<String>();
		LL3.add("A");
		LL3.add("B");
		LL3.add("C");
		LL3.add("D");
		LL3.add("E");
		int number=0;
		System.out.println("-----------------------------------");
		while(LL3.size()>number) {
			System.out.println("-----------------------------------");
			System.out.println("Using while loop:" +LL3.get(number));
			number++;
		}
		
	}
		public void LLusingIterator() {
			LinkedList<String> LL4= new LinkedList<String>();
			LL4.add("p");
			LL4.add("q");
			LL4.add("r");
			LL4.add("s");
			LL4.add("t");
			Iterator<String> iterator=LL4.iterator();
			System.out.println("-----------------------------------");
			while(iterator.hasNext()) {
				
				System.out.println("Using Iterator:"+iterator.next());
			}
			
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListExample linkedList = new LinkedListExample();
		linkedList.LinkedListMethodExample();
		linkedList.LLusingFor();
		linkedList.LLusingForeach();
		linkedList.LLusingwhile();
		linkedList.LLusingIterator();

	}

}
