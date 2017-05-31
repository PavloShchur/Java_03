package multithreading;

import java.util.concurrent.Phaser;

public class PhaserDemo {

	public static void main(String[] args) {
		Phaser phaser = new Phaser(1);
		int curPhase;

		System.out.println("������ ������");

		new MyThread(phaser, "A");
		new MyThread(phaser, "B");
		new MyThread(phaser, "C");

		curPhase = phaser.getPhase();
		phaser.arriveAndAwaitAdvance();
		System.out.println("���� " + curPhase + " ���������");
		
		curPhase = phaser.getPhase();
		phaser.arriveAndAwaitAdvance();
		System.out.println("���� " + curPhase + " ���������");
		
		curPhase = phaser.getPhase();
		phaser.arriveAndAwaitAdvance();
		System.out.println("���� " + curPhase + " ���������");
		
		phaser.arriveAndDeregister();
		
		if(phaser.isTerminated())
		System.out.println("������������ ��� ����������");
		
	}

}













