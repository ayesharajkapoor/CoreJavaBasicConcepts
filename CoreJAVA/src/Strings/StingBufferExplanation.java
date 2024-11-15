package Strings;

public class StingBufferExplanation {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		System.out.println("STRING is IMMUTABLE");
		String name= "Ayesha";
		System.out.println("Appending name to original : "+name.concat("Rafiq"));
		System.out.println("Original Name is :" + name);
		System.out.println("*********************************************");
		System.out.println("STRING BUFFER is MUTABLE");
		StringBuffer name1 = new StringBuffer("Ayesha");
		System.out.println("Appending name to original: " +name1.append("Rafiq"));
		System.out.println("Original name is: " +name1);
		
		
		//String buffer methods
		
		//1. reverse
		StringBuffer s1= new StringBuffer("Sammu");
		System.out.println("The reverse sting is:" +s1.reverse());
		//2. replace
		StringBuffer replacethis= new StringBuffer("Rafiq");
		System.out.println(replacethis.replace(3, 4, "ee"));
		//3. delete
		StringBuffer deletethis = new StringBuffer("Sammu");
		System.out.println(deletethis.delete(3, 4));
		//4. insert
		StringBuffer insertthis = new StringBuffer("Sam");
		System.out.println(insertthis.insert(3,"haan"));
		//5. Capacity
		System.out.println(insertthis.capacity());
		
		//6. ChartAt, Length and substring
		
		StringBuffer s2= new StringBuffer("Ayesha");
		System.out.println("The CharAT is:" +s2.charAt(2));
		System.out.println("The length is:"+s2.length());
		System.out.println("The substring is:"+s2.substring(2));
	}
	
	
	
	
	
	
	
	
}
