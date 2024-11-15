package Strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// STring methods
		String value = "RafiqSammu";// String literal
		String name="rafiq";
		String name1="AYESHA";
		
		
		int number=30;
		//1. chartAt()
		System.out.println(value.charAt(3));
		//2.length()
		System.out.println(value.length());
		//3. equals()
		System.out.println(value.equals("RafiqSAmmu"));
		//4. equalsIgnoreCase()
		System.out.println(value.equalsIgnoreCase("RAFIQSAMMU"));
		//5. isEmpty()
		System.out.println(value.isEmpty());
		//6. contains
		System.out.println(value.contains("Sammu"));
		//7. concat()
		System.out.println(value.concat("Ayesha"));
		//8. toUpperCase()
		System.out.println(name.toUpperCase());
		//9. toLowerCase()
		System.out.println(name1.toLowerCase());
		//10.indexof()
		System.out.println(value.indexOf("q"));
		System.out.println(value.indexOf("S", 0));
		System.out.println(value.indexOf('a', 0));
		System.out.println(value.indexOf("ammu", 0));
		//11. valueof
		String s= String.valueOf(number);
		System.out.println(s);
		//12.substring
		System.out.println(value.substring(4));;
		System.out.println(value.substring(0, 5));
		//13. join()
		String s1= String.join("-", "Learn","Automation","Online");
		String s2= String.join("/", "11","5","1994");
		System.out.println(s1);
		System.out.println(s2);
		//14. split()
		
		String splitthis="Are,we,good,at,teaching?";
		String[] spliitedwords=splitthis.split(",");
		for (String string : spliitedwords) {
			System.out.println(string);
		}
		//15. trim
		String value1=" Allah ";
		System.out.println(value1.trim());
		//16. replace
		System.out.println(value.replace('a', 'A'));
		System.out.println(value.replace("Sammu", "Ayesha"));


	
	}

}
