package changes.java8;

import java.util.Arrays;
import java.util.List;

public class StreamLimitSkip {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,4,6,34,32,17,19,29,23);
		// print first 5 numbers
//		 numbers.stream().limit(5).forEach(System.out::println);
		// skip first 5 numbers
//		numbers.stream().skip(5).forEach(System.out::println);
		// now if we need to take all first number which are greater then 30
		// i.e. 12,4,6
		
		

	}

}
