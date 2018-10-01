package chapter05._01_predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest03 {

	public static void main(String[] args) {
		List<String> greeting = new ArrayList<>();
		greeting.add("hello");
		greeting.add("world");
		greeting.add("hi");
		greeting.add("injavawetrust");
		
		Predicate<String> predicate = (String str) -> {
			return str.startsWith("h");
		};
		greeting.removeIf(predicate.negate());
		greeting.forEach(System.out::println);
	}
}
