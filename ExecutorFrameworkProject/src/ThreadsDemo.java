
public class ThreadsDemo {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++ ) {
			Thread thread1 = new Thread(new Task());
			thread1.start();
		}
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		/*Thread thread1 = new Thread(new Task());
		thread1.start();
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		*/
	}

}
