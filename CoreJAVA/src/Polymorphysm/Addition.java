package Polymorphysm;

public class Addition {

	public int add (int a, int b) {
		return a+b;
	}
	public int add (int a, int b,int c) {
		return a+b+c;
	}
	public float add (float a , float b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add= new Addition();
		System.out.println("The sum of two numbers:"+add.add(10, 20));
		System.out.println("The sum of three numbers:"+add.add(10, 20,30));
		System.out.println("The sum of float numbers:"+add.add(10.5f, 20.56f));
	}

}
