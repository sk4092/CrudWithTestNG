package com.scp.CrudWithTestNG.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	static String path="E:\\swapnil\\Scp\\New folder\\employees.xlsx";
	public void getExcelData() {
		/*XSSFWorkbook workbook = new XSSFWorkbook(new File(path));
    	
    	XSSFSheet sheet = workbook.getSheetAt(0);
    	Iterator<Row> rowItr = sheet.rowIterator();
    	
    	Map<String,String> inputes =new HashMap<String,String>();
    	
    	int rowCount = 1;
    	while(rowItr.hasNext()) {
    		Row row= rowItr.next();
    		int colCount =1;
    		Iterator<Cell> cellItr = row.cellIterator();
    		while(cellItr.hasNext()) {
    			Cell cell = cellItr.next();
    			//printCellValue(cell);
    			colCount ++;
    			if(colCount>=4)break;
    		}
    		System.out.println();
    		rowCount++;
    		if(rowCount>=5)break;
    	}*/
	}
}
