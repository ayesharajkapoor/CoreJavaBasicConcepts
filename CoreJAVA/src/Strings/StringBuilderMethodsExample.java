package Strings;

public class StringBuilderMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String Builder Methods
		
		//String builder methods
		
				//1. reverse
				StringBuilder s1= new StringBuilder("Sammu");
				System.out.println("The reverse sting is:" +s1.reverse());
				//2. replace
				StringBuilder replacethis= new StringBuilder("Rafiq");
				System.out.println(replacethis.replace(3, 4, "ee"));
				//3. delete
				StringBuilder deletethis = new StringBuilder("Sammu");
				System.out.println(deletethis.delete(3, 4));
				//4. insert
				StringBuilder insertthis = new StringBuilder("Sam");
				System.out.println(insertthis.insert(3,"haan"));
				//5. Capacity
				System.out.println(insertthis.capacity());
				//6. ChartAt, Length and substring
				
				StringBuilder s2= new StringBuilder("Ayesha");
				System.out.println("The CharAT is:" +s2.charAt(2));
				System.out.println("The length is:"+s2.length());
				System.out.println("The substring is:"+s2.substring(2));
	}

}
