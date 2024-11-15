package abstraction;

public class Benz extends Car implements UpcomingProject,interface2{
	@Override
	public void engineSecret() {
	 System.out.println("Benz engine secret");	
	}
	@Override
	public void companyVault() {
		System.out.println("Benz company Vault");
	}
	
	public void employee1() {
		// TODO Auto-generated method stub
		System.out.println("Employee1 Details");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car= new Benz();
		car.companyVault();
		car.engineSecret();

	}
	
}
