package Polymorphysm;

public class Son extends Parents{
	@Override
	public void marriage() {
		System.out.println("My marriage my rules");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents parents = new Son(); // parentclass ref = new Childclass(); 
		parents.properties();
		parents.marriage();
		

	}

}
