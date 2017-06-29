package com.fannie.threads;

class YourJob{}

class MyJob extends YourJob implements Runnable{
	
	Thread t;
	
	public MyJob(String threadName, int priority){
		t = new Thread(this, threadName);
		t.setPriority(priority);
		//this will create an OS level thread and then run.
		t.start();
	}
	
	public MyJob(){
	}
	
	@Override
	public void run() {
		for(int i=0;i<500;i++){
			System.out.println(i +", "+Thread.currentThread().getName());
			
		}
		System.out.println("Thread "+Thread.currentThread().getName()+" existing");
		
	}
	
}
public class RunnableExample1 {
	public static void main(String[] args) {
		//parameteric constructor will create a thread and call run method.
		MyJob m1 = new MyJob("MyThread",6);
		MyJob m2 = new MyJob("Surya",7);
		MyJob m3 = new MyJob("Hema",8);
		
		Thread t1 = new Thread(new MyJob());
		t1.setName("Medha");
		t1.setPriority(6);
		t1.start();
	}

}
