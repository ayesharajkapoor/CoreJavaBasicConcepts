package collections;

import java.lang.Character.Subset;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExample {
public void treesetmethods() {
	//Creating Treeset
	TreeSet<Integer> tree= new TreeSet<Integer>();
	//add()
	tree.add(10);
	tree.add(1);
	tree.add(2);
	tree.add(9);
	tree.add(7);
	tree.add(3);
	System.out.println("Elements are sored on ascending order:" +tree);
	//first - get first element
	System.out.println("First element:" +tree.first());
	//first - get last element
	System.out.println("Last element:" +tree.last());
	//headset()
	System.out.println("Values lesser than given value: "+tree.headSet(3));
	//tailset
	System.out.println("Values equals to & higher than given value: "+tree.tailSet(9));
	//subset()
	System.out.println("Subset Values:"+tree.subSet(2, 9));
	//comparator()
	System.out.println("Comparator return null if the sorting is default natural order: "+tree.comparator());
	//higher
	System.out.println("Higher :" +tree.higher(3));
	//lower
	System.out.println(("Lower:" +tree.lower(7)));
	//pollFirst
	System.out.println("PollFirst:" +tree.pollFirst());
	//pollLast
	System.out.println("PollLast:" +tree.pollLast());
	System.out.println("Afterb polling : " +tree);
	System.out.println("Descending order set :" +tree.descendingSet());
	
	//Iterator - normal iteration
	
	Iterator<Integer> iterator= tree.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	//descending order available in iterator interfaces
	Iterator<Integer> descIterator = tree.descendingIterator();
	while(descIterator.hasNext()) {
		System.out.println(descIterator.next());
		
	}
	
	//null pointer exception
//	tree.add(null);
//	System.out.println(tree);
	//class cast exception
	TreeSet<StringBuffer> set = new TreeSet<StringBuffer>();
	set.add(new StringBuffer("B"));
	set.add(new StringBuffer("A"));
	System.out.println(set);
	
	
}
	public static void main(String[] args) {
		TreesetExample treeset= new TreesetExample();
		treeset.treesetmethods();
		// TODO Auto-generated method stub

	}

}
