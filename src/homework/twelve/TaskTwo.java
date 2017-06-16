package homework.twelve;

import java.util.*;
import java.util.stream.*;

public class TaskTwo {
	public static void main(String[] args) {

		Person personOne = new Person("Goshko", 190);
		Person personTwo = new Person("Pesho", 170);
		Person personThree = new Person("Ivancho", 180);

		List<Person> people = Arrays.asList(personOne, personTwo, personThree);
		List<String> allPeoplesNames = people.stream()
				.map(person -> person.getName())
				.collect(Collectors.toList());
		System.out.println("List with all peoples names: " + allPeoplesNames);
	}
}
