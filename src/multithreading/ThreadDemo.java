package multithreading;

public class ThreadDemo extends Thread {

	private Thread t;
	private String threadName;
	PrintDemo PD;

	public ThreadDemo(String threadName, PrintDemo pD) {
		this.threadName = threadName;
		PD = pD;
	}

	public void run() {
		synchronized(PD){
			
			PD.printCount();
			System.out.println("Thread " + threadName + " exiting");
		}
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}
