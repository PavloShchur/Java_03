package multithreading;

import java.util.concurrent.Semaphore;

public class SemDemo {

	public static void main(String[] args) {
			Semaphore semaphore = new Semaphore(1);
			
			new IncThread("A", semaphore);
			new DecThread("B", semaphore);

	}
	
	 static class Shared {
		static int count = 0;
	}

}
