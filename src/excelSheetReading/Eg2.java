package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("C:\\Selenium1\\20AugEvining.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		//string cell type
		Cell myCell = mySheet.getRow(0).getCell(0);
		System.out.println(myCell.getCellType());
	    String myValue = myCell.getStringCellValue();
	    System.out.println(myValue);
	    System.out.println("=================================================");
	    
	    //Boolean cell type
	    Cell myCell2 = mySheet.getRow(0).getCell(2);
	    System.out.println(myCell2.getCellType());
	    boolean myValue2 = myCell2.getBooleanCellValue();
	    System.out.println(myValue2);
	    System.out.println("=================================================");
	    
	    //Numeric cell type
	    Cell myCell3 = mySheet.getRow(0).getCell(1);
		System.out.println(myCell3.getCellType());
		double myvalue3 = myCell3.getNumericCellValue();
		System.out.println(myvalue3);
		System.out.println("=================================================");
		
	}

}
