
class Task implements Runnable {

	//public static int counter = 1;
	/*public static void main(String[] args) {
		for(int i = 0; i < 10; i++ ) {
			Thread thread1 = new Thread(new Task());
			thread1.start();
		}
		System.out.println("Thread Name: "+Thread.currentThread().getName());
	}
	*/
	@Override
	public void run() {
		for(int i =1; i < 5; i++)
			System.out.println("Counter: "+i+" Thread Name: "+Thread.currentThread().getName());
	}

}