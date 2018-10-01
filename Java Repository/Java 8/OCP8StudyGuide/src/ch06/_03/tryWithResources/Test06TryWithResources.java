package ch06._03.tryWithResources;

public class Test06TryWithResources {

	public static void main(String[] args) {
		try (Auto a1 = new Auto(1); Auto a2 = new Auto(2)) {
			System.out.println("try-block");
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("catch-block");
		} finally {
			System.out.println("finally-block");
		}
	}

}

class Auto implements AutoCloseable {
	int num;

	Auto(int num) {
		this.num = num;
	}

	public void close() {
		System.out.println("Close: " + num);
	}

}