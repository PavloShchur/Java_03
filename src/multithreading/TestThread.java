package multithreading;

public class TestThread {

	public static void main(String[] args) {
		PrintDemo PD = new PrintDemo();
		
		ThreadDemo T1 = new ThreadDemo("Therad - 1 ", PD);
		ThreadDemo T2 = new ThreadDemo("Therad - 2 ", PD);
		
		T1.start();
		T2.start();
		
		try {
			T1.join();
			T2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}

}
