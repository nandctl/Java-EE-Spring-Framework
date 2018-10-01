package ch07._09.concurrentCollections;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Test05ConcurrentLinkedDeque {

	public static void main(String[] args) {

		Deque<Integer> deque = new ConcurrentLinkedDeque<>();
		deque.offer(100); // add last
		deque.offer(20); //
		deque.push(50); // add first
		deque.push(80);
		
		System.out.println(deque);
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.poll());
	}
}
