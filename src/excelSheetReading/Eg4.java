package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
       File myFile=new File("C:\\Selenium1\\20AugEvining.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		
		//read all same type of data from excel
		//outer for loop-->row-->0-1
		for(int row=0;row<=1;row++)
		{
			//inner for loop-->Cell-->0-2
			for(int cell=0;cell<=2;cell++)
			{
				//read data from sheet
				
				double myValue = mySheet.getRow(row).getCell(cell).getNumericCellValue();
				
				System.out.println(myValue+" ");
			}
			System.out.println();
		}
	}

}
