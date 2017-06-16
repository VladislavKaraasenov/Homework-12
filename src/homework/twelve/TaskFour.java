package homework.twelve;

import java.util.*;

public class TaskFour {
	public static void main(String[] args) {

		Person personOne = new Person("Goshko", 190);
		Person personTwo = new Person("Pesho", 170);
		Person personThree = new Person("Ivancho", 180);

		List<Person> people = Arrays.asList(personOne, personTwo, personThree);

		Optional<Integer> maximumHeight = people.stream()
				.map(person -> person.getHeightInCentimeters())
				.reduce(Integer::max);
		if (maximumHeight.isPresent()) {
			for (Person person : people) {
				if (person.getHeightInCentimeters() == maximumHeight.get()) {
					System.out.println("The tallest person in the list is: " + person.getName());
				}
			}
		} else {
			System.out.println("List is empty.");
		}
	}
}
