package chapter06._03_optional;

import java.util.Locale;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class OptionalTest05 {

	public static void main(String[] args) {
		Stream.of("eeny ", "meeny ", null).forEach(OptionalTest05::toUpper);
	}

	private static void toUpper(String str) {
		//
		Optional<String> string = Optional.ofNullable(str);
		System.out.print(string.map(String::toUpperCase).orElse("dummy"));
	}
}
