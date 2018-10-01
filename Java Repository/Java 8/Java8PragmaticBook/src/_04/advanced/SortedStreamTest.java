package _04.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStreamTest {

	public static void main(String[] args) {
		//
		List<Integer> numbers = Arrays.asList(1, 20, 3, -21, 2);

		List<Integer> ordered = numbers.stream().sorted().collect(Collectors.toList());

		System.out.println(ordered);
	}
}
