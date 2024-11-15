package Exceptions;

public class TryCatchsimpleexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int number1=0;
			int number2=3;
			int result=number2/number1;
			System.out.println(result);
					
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("This is due to null value occured");
		}
		catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("Dont divide by zero");
			
		}
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Drink Lemon juice, Dont divide by zero");
		}

	}

}
