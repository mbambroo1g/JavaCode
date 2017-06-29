package com.fannie.threads;

class Account {
	private int money;

	Account(int amt) {
		// get amt from database
		money = amt;
	}

	//one word made all the difference. Sunchronized can be used at object level and statement level
	synchronized void withdraw(int amt) {
		if (amt < money) {
			try {
				Thread.sleep(1000);
				money = money - amt;
			} catch (Exception e) {
			}

			System.out.println("Received " + amt + " by " + Thread.currentThread().getName());
		} else {
			System.out.println(
					"Sorry " + Thread.currentThread().getName() + ", Requested amt (" + amt + ") is not available.");
			
		}
		System.out.println("Balance " + money);
	}
}
