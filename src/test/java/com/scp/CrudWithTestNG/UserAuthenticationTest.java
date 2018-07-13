package com.scp.CrudWithTestNG;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.scp.CrudWithTestNG.business.*;
import com.scp.CrudWithTestNG.util.ReadExcel;

public class UserAuthenticationTest {

	@Test(dataProvider="getDataFromExcel")
	public void test1(String userName,String password){
		Authenticate authenticate = new Authenticate();
		authenticate.authenticate(userName, password);
	}
	
	@DataProvider(name="getDataFromExcel")
	 public String[][] getData() throws InvalidFormatException, IOException{
		String[][] data = ReadExcel.getExcelData();
	    return data;
	 
	 }
}
