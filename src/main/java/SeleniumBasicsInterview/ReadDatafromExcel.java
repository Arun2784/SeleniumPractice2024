package SeleniumBasicsInterview;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatafromExcel {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Asus\\OneDrive\\Desktop\\Automation Interview\\howtoreaData.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
	XSSFSheet sheet = workbook.getSheetAt(0);
//		String rowvalue= sheet.getRow(0).getCell(0).getStringCellValue();
//		 System.out.println(rowvalue);
		
		
		
		int rowcount= sheet.getPhysicalNumberOfRows();
		
		for(int i =0; i<rowcount; i++) {
			
			XSSFRow row =sheet.getRow(i);
			
			int cellcount =row.getPhysicalNumberOfCells();
			
			for(int j=0; j < cellcount; j++) {
						
				XSSFCell cell = row.getCell(j);
				
				String cellvalue =getcellValue(cell);
				
				System.out.print(" || " + cellvalue);
						
			}	
			System.out.println();
			
		}
		
		workbook.close();
		fis.close();
	
	}
		
		public static   String getcellValue(XSSFCell cell) {
			
			switch(cell.getCellType()) {
			
			case NUMERIC:
			
			return String.valueOf(cell.getNumericCellValue());
			
			case BOOLEAN :
				return String.valueOf(cell.getBooleanCellValue());
				
			case STRING:
				return  cell.getStringCellValue();
				
				default:
					
					return cell.getStringCellValue();
			
			}
			
			
			
		}
		
		

	}


