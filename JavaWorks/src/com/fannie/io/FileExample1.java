package com.fannie.io;

import java.io.File;
//Ctrl+Shift+O - importing all packages at once;
//Ctrl+Shift+F - Formatting;
import java.io.IOException;


//alt+ updown arrow - shift code
//alt+shft+z - surround with try catch block.

public class FileExample1 {
	public static void main(String[] args) {
		File f = new File("Emp.txt");
		//Create a file
		try {
			Boolean flag = f.createNewFile();
			System.out.println(flag?"File created.":"File not created.");
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			//System.out.println(f.delete());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
