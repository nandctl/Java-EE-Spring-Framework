package chapter11._02.racecondition;

class Counter {
	public static long count = 0;
}
class UseCounter implements Runnable {

	public void increment() {
		Counter.count++;
		System.out.print(Counter.count + " ");
	}

	public void run() {
		increment();
		increment();
		increment();
	}
}
public class RaceCondition {
	public static void main(String args[]) throws InterruptedException {

		UseCounter c = new UseCounter();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}
