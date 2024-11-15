package conditionalStatements;
//It explains if else if ladder

public class WhoistheHero {

	String myHero = "SuperMan";

	public void SuperHeroGuessor() {
		if (myHero.equals("Iron Man")) {
			System.out.println("You thought about Iron Man");
		} else if (myHero.equals("Thor")) {
			System.out.println("You thought about Thor");
		} else if (myHero.equalsIgnoreCase("Superman")) {
			System.out.println("You thought about Super man");
		} else {
			System.out.println("Sorry I cant guess");
		}
	}

	public static void main(String[] args) {

		WhoistheHero hero = new WhoistheHero();
		hero.SuperHeroGuessor();

	}

}
