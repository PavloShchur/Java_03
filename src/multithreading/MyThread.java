package multithreading;

import java.util.concurrent.Phaser;

public class MyThread implements Runnable {

	Phaser phaser;
	String name;

	public MyThread(Phaser phaser, String name) {
		super();
		this.phaser = phaser;
		this.name = name;
		phaser.register();
		new Thread(this).start();
	}

	@Override
	public void run() {
		System.out.println("���� " + name + " ������ ���� ����� ����");
		phaser.arriveAndAwaitAdvance();

		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("���� " + name + " ������ ���� ����� ����");
		phaser.arriveAndAwaitAdvance();

		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("���� " + name + " ������ ���� ����� ����");
		phaser.arriveAndAwaitAdvance();

	}

}
