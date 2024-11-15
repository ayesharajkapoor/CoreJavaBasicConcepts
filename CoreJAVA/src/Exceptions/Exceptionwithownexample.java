package Exceptions;

public class Exceptionwithownexample {

	public void makemygirllaugh() {
	try {
		throw new MachanInterruptedExceptions("MAchan is hitting you");
	}
	catch (MachanInterruptedExceptions e) {
		// TODO: handle exception
		//e.printStackTrace();
		System.out.println("give me weird post to post in instagaram");
	}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exceptionwithownexample exe= new Exceptionwithownexample();
		exe.makemygirllaugh();

	}

}
