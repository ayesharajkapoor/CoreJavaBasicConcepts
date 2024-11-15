package abstraction;

public class BMW extends Car {
	@Override
	public void engineSecret() {
	 System.out.println("BMW's engine secret");	
	}
	@Override
	public void companyVault() {
		System.out.println("BMW's company Vault");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car car= new BMW(); //Dynamic Polymorphism
		car.engineSecret();
		car.companyVault();
		

	}

}
