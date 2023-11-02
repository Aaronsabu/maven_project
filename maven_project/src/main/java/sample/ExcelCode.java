package sample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelCode {

    public static FileInputStream f;
    public static XSSFWorkbook wb;
    public static XSSFSheet sh;

    public static String readStringData(int i, int j) throws IOException{

    	f = new FileInputStream("D:\\Demo\\employee.xlsx");
    	wb= new XSSFWorkbook(f);
    	sh = wb.getSheet("new Sheet");
    	XSSFRow r = sh.getRow(i);
    	XSSFCell c =r.getCell(j);
    	return c.getStringCellValue();
   }


    public static double readNumericData(int i, int j ) throws IOException{

    	f = new FileInputStream("Demoemployee.xlsx");
    	wb = new XSSFWorkbook(f);
    	sh = wb.getSheet("new Sheet");
    	XSSFRow r = sh.getRow(i); 
    	XSSFCell c = r.getCell(j);
    	return c.getNumericCellValue();
    }
}
