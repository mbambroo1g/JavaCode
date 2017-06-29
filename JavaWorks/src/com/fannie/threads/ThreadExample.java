package com.fannie.threads;

class BusinessLogic extends Thread{
	@Override
	public void run() {
		//simulation to kill time
		for (int i = 0; i<20; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value of I is: "+i +" in Thread "+ Thread.currentThread().getName());
			if (Thread.interrupted())
				try {
					throw new InterruptedException();
				} catch (InterruptedException e) {
					System.out.println("Thread interrupted.");
					e.printStackTrace();
				}
		}
		System.out.println("Thread "+Thread.currentThread().getName()+ " is existing.");
	}
}

public class ThreadExample {
	public static void main(String[] args) {
		//if a class has a main method it is a thread class.
		System.out.println("Thread name: "+Thread.currentThread().getName());
		System.out.println("Thread priority: "+Thread.currentThread().getPriority());
		
		BusinessLogic bl1 = new BusinessLogic();
		//This will create an OS level thread and give control to run
		bl1.setPriority(Thread.NORM_PRIORITY+1);
		int bl1priority= bl1.getPriority();
		
		bl1.start();
		BusinessLogic bl2 = new BusinessLogic();
		bl2.setPriority(bl1priority+1);
		bl2.start();
		for (int i = 0; i<50; i++){
			System.out.println("The value of J is: "+i +" in Thread "+ Thread.currentThread().getName());
		}
		try {
			bl1.join();
			bl2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread "+Thread.currentThread().getName()+ " is existing.");
	}
}
