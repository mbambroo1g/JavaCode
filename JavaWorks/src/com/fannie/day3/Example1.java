package com.fannie.day3;

import java.util.InputMismatchException;

public class Example1 {
	public static void main(String[] args) {
		try {
			int num1 = 10;
			int num2 = 5;
			try {
				int num[] = new int[4];
			} catch (NegativeArraySizeException nase) {
				System.out.println("Negative array size is not allowed.");
			} finally {
				System.out.println("From Finally");
			}
			int result = num1 / num2;
			System.out.println("Result is: " + result);
		} catch (ArithmeticException ae) {
			System.out.println("Dividing by 0 is not allowed. " + ae.getMessage());
			// This just prints /by zero. +e results in the full exception.
		} catch (NegativeArraySizeException nase) {
			System.out.println("Array creation with negative numvers is not allowed. " + nase);

		} catch (InputMismatchException ime) {
			System.out.println("Something... " + ime);

		} catch(NumberFormatException nfe){
			System.out.println("fff");
		}

		catch (Exception e) {
			System.out.println("Something went wrong. " + e.getMessage());
		} finally {
			System.out.println("Placeholder for additional business logic.Finally");
		}
	}
}
