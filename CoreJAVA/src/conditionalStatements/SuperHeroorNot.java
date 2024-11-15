package conditionalStatements;

//it explains switch case

public class SuperHeroorNot {
	String hero ="Captain America";
	public void HeroorNot() {
		switch (hero) {
		case "Captain America":
			System.out.println("Captain America is a super hero");
			break;
		case "Super Man":
			System.out.println("Super Man is a super hero");
			break;
		case "Bat Man":
			System.out.println("Bat Man is a super hero");
			break;

		default:
			System.out.println(hero +"Sorry we dont know about the person");
		
		}
	}

	public static void main(String[] args) {
	SuperHeroorNot herofind= new SuperHeroorNot();
	herofind.HeroorNot();

	}

}
