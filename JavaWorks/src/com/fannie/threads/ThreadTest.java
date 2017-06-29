package com.fannie.threads;

public class ThreadTest implements Runnable {
	Account a;
	int amt;

	public static void main(String str[]) {
		Account lb = new Account(1000);
		new ThreadTest(lb, "A", 500);
		new ThreadTest(lb, "B", 750);
	}

	public ThreadTest(Account a, String name, int amt) {
		this.a = a;
		this.amt = amt;
		new Thread(this, name).start();
	}

	public void run() {
		synchronized (a){
		a.withdraw(amt);
		}
	}
}
