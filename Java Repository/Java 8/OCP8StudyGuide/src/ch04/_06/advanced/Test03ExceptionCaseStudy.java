package ch04._06.advanced;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class Test03ExceptionCaseStudy {

	private static List<String> create() throws IOException {
		throw new IOException();
	}

	private static List<String> createSafe() {
		try {
			return Test03ExceptionCaseStudy.create();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void test1() throws IOException {

		Supplier<List<String>> s = () -> {
			try {
				return create();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
	}

	private void test2() throws IOException {
		Test03ExceptionCaseStudy.create().stream().count();
	}

	private void test3() {
		Supplier<List<String>> ss = Test03ExceptionCaseStudy::createSafe;
	}
}
