package Polymorphysm;

public class TheWaywetalk {
	public void talk(Parents styleoftalking) {
		System.out.println("Polite");
		
	}
public void talk(Partner styleoftalking) {
		System.out.println("Love! Mixture of everythings");
	}
public void talk(Boss styleoftalking) {
	System.out.println("Nothing personal");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheWaywetalk walk = new TheWaywetalk();
		Parents parents = new Parents();
		Partner partner= new Partner();
		Boss boss= new Boss();
		walk.talk(parents);
		walk.talk(boss);
		walk.talk(partner);

	}

}
