package optional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImperativeToFunctional {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int result = 0;
		for (int i = 0; i < numbers.size(); i++) {
			Integer num = numbers.get(i);
			if (num > 5 && num % 2 == 0 && num < 9 && num * 2 > 15) {
				result = num;
				break;
			}
		}

		/* 1. Predict the result without running the code. */
		//8
		System.out.println(result);

		/* 2. Write a functional alternative using the filter method. */
		Stream<Integer> numbersAsStream = numbers.stream();
		List<Integer> filteredNumbers = numbersAsStream
				.filter(num -> num > 5)
				.filter(num -> num % 2 == 0)
				.filter(num -> num < 9)
				.filter(num -> num * 2 > 15)
				.collect(Collectors.toList());
		System.out.println(filteredNumbers);

		
		/*
		 * 3. This example was used in conjunction with a survey to measure the
		 * difference in time it takes to understand imperative versus
		 * functional code. 
		 * 
		 * Read more about it here:
		 * http://blog.agiledeveloper.com/2015/08/prefer-functional-style-over-imperative.html
		 */

	}
}
