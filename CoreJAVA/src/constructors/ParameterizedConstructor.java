package constructors;

public class ParameterizedConstructor {
	String animal_name;
	String animal_type;

	ParameterizedConstructor(String name, String type) {

		animal_name = name;
		animal_type = type;
	}

	public void sayAboutAnimal() {
		System.out.println("The Animal name is :" + animal_name + "The Animal type is :" + animal_type);
	}

	public static void main(String[] args) {
		ParameterizedConstructor param=new ParameterizedConstructor("Duck", "Herbivoirous");
		param.sayAboutAnimal();
		ParameterizedConstructor param1 = new ParameterizedConstructor("Crow", "Omnivorous");
		param1.sayAboutAnimal();

	}

}
