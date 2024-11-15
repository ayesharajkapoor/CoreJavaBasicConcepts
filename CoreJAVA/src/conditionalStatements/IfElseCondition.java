package conditionalStatements;

public class IfElseCondition {
	
	boolean iscupEmtpy=true;

	public static void main(String[] args) {
		
		IfElseCondition exam=new IfElseCondition();
		if(exam.iscupEmtpy) {
			System.out.println("Fill the coffee");
		}
		else {
			System.out.println("Drink the coffee");
		}
	}

}
