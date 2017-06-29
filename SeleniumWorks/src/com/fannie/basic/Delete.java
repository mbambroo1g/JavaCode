package com.fannie.basic;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Delete {
	public static void main(String[] args) throws Exception {
		File src=new File("C:\\Users\\Huser\\Medha\\Workspace\\SeleniumWorks\\LoginUsers.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1= wb.getSheetAt(0);

		System.out.println(sh1.getPhysicalNumberOfRows());

		int rowCount = sh1.getPhysicalNumberOfRows();
		List list = Arrays.asList(new String[][]{});
		for(int i=1;i<rowCount;i++){
			String a = sh1.getRow(i).getCell(0).getStringCellValue();
			String b= sh1.getRow(i).getCell(1).getStringCellValue();
			System.out.println(i);
			System.out.println(a);
			System.out.println(b);
			list = Arrays.asList(new String[][]{{a, b}});
			//return list;
		}


		// 		System.out.println(list);

	}
}
