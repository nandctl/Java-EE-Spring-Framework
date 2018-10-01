package chapter11._10.callable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableImpl implements Callable<Integer> {
     int from;
     int to;
   public CallableImpl(int from , int to) {
		 this.from = from;
		 this.to= to;
	}
	
	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		int sum = 0;
		for (int i = from; i <to; i++) {
			sum = sum + i;
		}
		return sum;
	}

}

public class Test01ExecutorServiceCallable {

	private static int total=0;
	 
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		Callable<Integer> task1 = new CallableImpl(0,20);
		Callable<Integer> task2 = new CallableImpl(20,40);
		Callable<Integer> task3 = new CallableImpl(40,60);
		Callable<Integer> task4 = new CallableImpl(60,80);
		Callable<Integer> task5 = new CallableImpl(80,100);
	 List<Callable<Integer>> tasks = new ArrayList<Callable<Integer>>();
	 tasks.add(task1);
	 tasks.add(task2);
	 tasks.add(task3);
	 tasks.add(task4);
	 tasks.add(task5);
		List<Future<Integer>> future = executorService.invokeAll(tasks);
		for ( Future<Integer> futures : future){
	        Integer value = futures.get();
	        total = total + value;
		}
		System.out.println(total);
		executorService.shutdown();
	}
}
