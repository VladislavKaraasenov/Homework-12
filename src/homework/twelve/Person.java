package homework.twelve;

public class Person {

	private String name;
	private int heightInCentimeters;

	public Person(String name, int heightInCentimeters) {
		this.name = name;
		this.heightInCentimeters = heightInCentimeters;
	}

	public String getName() {
		return this.name;
	}

	public int getHeightInCentimeters() {
		return this.heightInCentimeters;
	}

}
