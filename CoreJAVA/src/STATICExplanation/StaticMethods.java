package STATICExplanation;

import java.security.PublicKey;

public class StaticMethods {
	
	public static void method1() {
				System.out.println("Static method");
	}
	public void method2() {
		method1();
		System.out.println("Non Static method");
	}
	

	public static void main(String[] args) {
		method1();
		
		
	}

}
