package multithreading;

import java.util.concurrent.Semaphore;

import multithreading.SemDemo.Shared;

public class IncThread implements Runnable{

	String name;
	Semaphore sem;
	
	
	public IncThread(String name, Semaphore sem) {
		super();
		this.name = name;
		this.sem = sem;
		new Thread(this).start();
	}


	@Override
	public void run() {
		System.out.println("Запуск потоку " + name);
		try{
			System.out.println("Потік " + name + " чекає дозволу");
			sem.acquire();
			System.out.println("Потік " + name + " отримує дозвіл");
			
			for (int i = 0; i < 5; i++) {
				Shared.count++;
				System.out.println(name + ": " + Shared.count);
				
				Thread.sleep(10);
			}
			
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Потік " + name + " звільняє дозвіл");
		sem.release();
	}
	
	

}













