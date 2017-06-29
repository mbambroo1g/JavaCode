package com.fannie.jobsTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.fannie.jobs.MyJob1;

public class MyJobTest {
	
	MyJob1 myJob;
	boolean flag;
	int num;
	List<String> myList=new ArrayList<String>();
	
	@Before//This method will be invoked before every test.
	public void setUp() {
		myJob = new MyJob1();
		System.out.println("Calling from Before...");
		myList.add("Test1");
		//myList.add("Test2");
	}
	@After//This will be invoked after each test.
	public void tearDown() {
		System.out.println("Calling from After...");
	}
	
	@Test
	public void test1() {
		System.out.println("Calling from Test1...");
		flag = myJob.insertEmp(1);
		//expected, actual
		assertEquals(true, flag);
		assertTrue(flag);
	}
	
	@Test(timeout=30)
	public void test2() {
		System.out.println("Calling from Test2....");
		num = myJob.getNumberOfEmps();
		assertEquals(5, num);
		}
	
	@Test //Required for a method to be executed as a test.
	public void test3(){
		System.out.println("Calling from Test3....");
		flag = myJob.insertEmp(2);
		assertFalse(flag);
	}
	
	@Test
	public void test4(){
		System.out.println("Calling from Test5....");
		int index = myList.size();
		assertEquals(1,index);
	}
	
	@Test
	public void test5(){
		System.out.println("Calling from Test4....");
		assertEquals(6, myList.size());
	}
	}