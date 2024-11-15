package Exceptions;

public class TryCatchwithSimpleExample {
	public  static int dummy() {
		return 3;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Inside Try Block");
			//throw new Exception(); //Induced Artifically exception
			//System.out.println(2/0);
			System.out.println(dummy());
			System.out.println("After Exception");
		} catch (Exception e) {
			System.out.println("Inside Catch Block");
		} finally {
			System.out.println("Inside Finally Block");
		}
	}

}
