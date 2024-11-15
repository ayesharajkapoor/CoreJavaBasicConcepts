package constructors;

public class DefaultConstuctor {
	String studentname;
	int rollno;

	/*
	 Example of default constructor
	 
	 Do you see any constructor here.. Nope.. we couldnot see that.. Complier will provide one
	 */


	public static void main(String[] args) {
		DefaultConstuctor def=new DefaultConstuctor();
		System.out.println(def.studentname);
		System.out.println(def.rollno);
		
	}

}
