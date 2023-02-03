package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
      File myFile=new File("C:\\Selenium1\\20AugEvining.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		//how to read whole row-->Cell is varying and row is constant
		
		for(int i=0;i<=2;i++)
		{
		
		 String myValue = mySheet.getRow(0).getCell(i).getStringCellValue();	
		 System.out.println(myValue+" ");
		}
		System.out.println();
		
		System.out.println("===============================================");
	
	
	//how to read whole cell(column)-->cell is constant and row is varying
	for(int i=1;i<=3;i++)
	{
		
	    String myValue = mySheet.getRow(i).getCell(0).getStringCellValue();
	    
	    System.out.println(myValue);

}
}
}