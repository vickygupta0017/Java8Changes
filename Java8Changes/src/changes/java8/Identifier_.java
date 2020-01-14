package changes.java8;

import java.util.stream.IntStream;

public class Identifier_ {

	public static void main(String[] args) {
		int _ = 7;
		System.out.println("value of identifier _ is "+_);
		
		IntStream.iterate(0 ,e->e+2).limit(5).forEach(System.out::println);

	}

}
