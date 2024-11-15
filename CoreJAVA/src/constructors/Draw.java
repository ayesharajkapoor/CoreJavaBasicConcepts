package constructors;

// This Class explains  constructor overloading
public class Draw {
	String draw;

	Draw() {
		System.out.println("Draw object created");
	}

	Draw(String toDraw) {
		draw = toDraw;
		System.out.println("Drawed shape is:" + draw);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw drew = new Draw();
		Draw drew1 = new Draw("Circle");
	}

}
