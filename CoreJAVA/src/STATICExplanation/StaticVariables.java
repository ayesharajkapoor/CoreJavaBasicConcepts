package STATICExplanation;

public class StaticVariables {
	
	static int accountBalance=0;
	String depositedBy;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariables obj1= new StaticVariables();
		obj1.accountBalance=1000;
		obj1.depositedBy="Ayesha";
		StaticVariables obj2= new StaticVariables();
		obj2.accountBalance=2000;
		obj2.depositedBy="Rafiq";
		System.out.println("Object1 Integer:"+obj1.accountBalance);
		System.out.println("Object1 String:"+obj1.depositedBy);
		System.out.println("Object2 Integer:"+obj2.accountBalance);
		System.out.println("Object2 String:"+obj2.depositedBy);
		
		

	}

}
