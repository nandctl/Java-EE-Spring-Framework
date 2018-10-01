package chapter05._01_predicate;

import java.util.stream.Stream;

public class PredicateTest01 {

	public static void main(String[] args) {
		Stream.of("hello", "world", "injavawetrust").filter(str -> str.startsWith("h")).forEach(System.out::println);
	}
}
