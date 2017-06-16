package homework.twelve;

import java.util.*;

public class TaskThree {
	public static void main(String[] args) {

		Person personOne = new Person("Goshko", 180);
		Person personTwo = new Person("Ivancho", 170);
		Person personThree = new Person("Pesho", 165);

		List<Person> people = Arrays.asList(personOne, personTwo, personThree);

		Optional<Integer> longestName = people.stream()
				.map(person -> person.getName().length())
				.reduce(Integer::max);
		if (longestName.isPresent()) {
			System.out.println("The longet name from the list consist of: " + longestName.get() + " letters.");
		} else {
			System.out.println("List is empty.");
		}

	}
}
