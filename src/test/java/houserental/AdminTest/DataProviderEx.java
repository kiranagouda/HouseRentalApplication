package houserental.AdminTest;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.houserental.genericutility.ExcelUtlity;
import com.houserental.genericutility.FileUtlity;

public class DataProviderEx {
	FileUtlity fu=new FileUtlity();
	ExcelUtlity eu=new ExcelUtlity();
@Test(dataProvider="bookTicket")

public void getBookDetails(String src,String dst,String price)
{
	System.out.println(src+" "+dst+" "+price);
}
@DataProvider
public Object[][] bookTicket() throws IOException, Throwable
{
    String TEST_SCRIPT_EXCEL_FILE_PATH =fu.getFilePathFromPropertiesFile("testScriptdatafilePath");

	Object[][] obj=new Object[3][3];
	obj[0][0]=eu.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet5", 1, 0);
	obj[0][1]=eu.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet5", 1, 1);
	obj[0][2]=eu.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet5", 1, 2);

	obj[1][0]=eu.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet5", 2, 0);
	obj[1][1]=eu.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet5", 2, 1);
	obj[1][2]=eu.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet5", 2, 2);

	obj[2][0]=eu.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet5", 3, 0);
	obj[2][1]=eu.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet5", 3, 1);
	obj[2][2]=eu.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "Sheet5", 3, 2);

	
	return obj;
}
}
