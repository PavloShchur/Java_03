package multithreading;

import java.util.concurrent.CountDownLatch;

public class MyThead implements Runnable {
		CountDownLatch latch;
		
	public MyThead(CountDownLatch latch) {
			super();
			this.latch = latch;
			new Thread(this).start();
		}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			latch.countDown();
		}
	}
		
	
}
