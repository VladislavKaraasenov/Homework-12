package homework.twelve;

import java.util.*;
import java.util.stream.*;

public class TaskFive {
	public static void main(String[] args) {

		List<Double> numbers = Arrays.asList(-9.0, 9.0, -16.0, 16.0, -25.0, 25.0, -36.0, 36.0, -49.0, 49.0);

		List<Double> squareOfAllPositiveNumbers = numbers.stream()
				.filter(i -> i > 0)
				.map(i -> Math.sqrt(i))
				.collect(Collectors.toList());
		System.out.println("Square of all positive numbers in the list: " + squareOfAllPositiveNumbers);

	}
}
