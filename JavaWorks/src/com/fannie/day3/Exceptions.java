package com.fannie.day3;

public class Exceptions 
{
	public static void main(String[] args)
	{
		try
		{
			int x = 44/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Something goes here");
	}
}
