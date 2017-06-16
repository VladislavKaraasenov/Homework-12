package homework.twelve;

import java.util.*;

public class TaskOne {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(-10, -100, -1000, 10, 100, 10000, -20, -200, 20, 200);

		Optional<Integer> isThreeDigitNumber = numbers.stream()
				.filter(i -> (i < -99 || i > 99) && (i > -999 && i < 999))
				.findFirst();
		if (isThreeDigitNumber.isPresent()) {
			System.out.println(true);
		} else {
			System.out.println("There is no three digit number in the list.");
		}
	}
}
