package com.mercury.tours;

import org.testng.annotations.DataProvider;


public class ApplicationTestData {

	@DataProvider(name="Login")
	public Object[][] getDataFromDataprovider(){

		return new Object[][] {

			{"http://newtours.demoaut.com/mercurywelcome.php","testing", "testing"},

			{"http://newtours.demoaut.com/mercurywelcome.php","dixit", "dixit" },
			{"http://newtours.demoaut.com/mercurywelcome.php","testabhi", "testabhi" }

		};
	}


	@DataProvider(name="HDFC")
	public Object[][] getDataForHDFC(){

		return new Object[][] {

			{"1000"},
			{"2000" },
			{"3000" }

		};
	}


	@DataProvider(name="Search")
	public Object[][] SearchDataprovider(){

		return new Object[][] {

			{"Paris", "London"},

			{"New York", "Portland" }

		};
	}

	//-------------------------------------------- This is to read Excel Data------------

	@DataProvider(name = "LoginDataXLS")
	public Object[][] ExcelXLS() throws Exception{
		ReadExcel_XLS excel = new ReadExcel_XLS();
		Object[][] testObjArray = excel.getExcelData("D:\\F Drive\\Selenium Training Data\\workspace\\Mecury_Tours_HCL_Maven\\FlightTestData.xls","TestData");
		System.out.println(testObjArray);
		return testObjArray;

	}
	
	//-----------------This is to read XLSX Excel Data------------

	@DataProvider(name = "LoginDataXLSX")
	public Object[][] ExcelXLSX() throws Exception{
		ReadExcel_XLSX excel = new ReadExcel_XLSX();
		Object[][] testObjArray = excel.getExcelData("D:\\F Drive\\Selenium Training Data\\workspace\\Mecury_Tours_HCL_Maven\\LoginData.xlsx","Login");
		System.out.println(testObjArray);
		return testObjArray;

	}
}
