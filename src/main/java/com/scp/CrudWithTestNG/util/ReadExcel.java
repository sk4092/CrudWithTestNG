package com.scp.CrudWithTestNG.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	 
	static String path="D:\\swapnil\\Scoopen\\Workspace2\\CrudWithTestNG\\userTest.xlsx";
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		String [][] input = getExcelData(); 
		for(int i=0;i<5;i++){
			for(int j=0;j<2;j++){
				System.out.print(" "+input[i][j]);
			}
			System.out.println();
		}
	}
	
	public static String [][] getExcelData() throws InvalidFormatException, IOException {
		XSSFWorkbook workbook = new XSSFWorkbook(new File(path));
    	
    	XSSFSheet sheet = workbook.getSheetAt(0);
    	Iterator<Row> rowItr = sheet.rowIterator();
    	
    	String [][] inputes = new String [6][2];
    	int arrCol = 0;
    	int arrRow = 0;
    	
    	int rowCount = 1;
    	rowItr.next();
    	while(rowItr.hasNext()) {
    		Row row = rowItr.next();
    		arrCol = 0;
    		Iterator<Cell> cellItr = row.cellIterator();
    		while(cellItr.hasNext()) {
    			Cell cell = cellItr.next();
    			inputes[arrRow][arrCol] = cell.getStringCellValue();
    			arrCol++;
    			if(arrCol>1)break;
    		}
    		arrRow++;
    		if(arrRow>=5)break;
    	}
    	return inputes;
	}
}
