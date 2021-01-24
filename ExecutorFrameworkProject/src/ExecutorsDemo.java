import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo{

	public static void main(String[] args) {
		
		//get count of available cores
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println("Availbale Cores: "+coreCount);
		
		//Create the pool
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		
		//submit the tasks for execution
		for(int i = 0; i < 100; i++) {
			service.execute(new Task());
		}
		System.out.println("Thread Name: "+Thread.currentThread().getName());
	}

}
