package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ExcelClass implements AutoConst

{
	
	public static  String getCellValue1(String path,String Sheet,int row,int Cell)
	{
		String str="";
		try
		{
			FileInputStream fis=new FileInputStream(path);
			
			
			Workbook wb=WorkbookFactory.create(fis);
			
			Cell C=wb.getSheet(Sheet).getRow(row).getCell(Cell);
			 str =C.getStringCellValue();
			
			
		}
		catch(Exception e)
		{
			Reporter.log("path is not valid",true);
			Assert.fail();
			
		}
		
		
		
		
		return str;
	}
}
