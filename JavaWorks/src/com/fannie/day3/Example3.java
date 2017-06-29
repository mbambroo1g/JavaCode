package com.fannie.day3;

import java.io.IOException;

public class Example3 {
	public static void check() throws IOException {
		throw new IOException("hello");
	}
	
	public static void main(String[] args) {
		try{
			check();
		}
			catch(IOException e){
				e.printStackTrace();
			}
			System.out.println("Hello...");
	}
}
