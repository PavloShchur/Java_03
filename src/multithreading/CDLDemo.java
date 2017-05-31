package multithreading;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {

	public static void main(String[] args) {
		CountDownLatch countDownLatch = new CountDownLatch(5);
		System.out.println("Запуск потоку виконання");
		
		new MyThead(countDownLatch);
		
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Завершення потоку");
	}

}
