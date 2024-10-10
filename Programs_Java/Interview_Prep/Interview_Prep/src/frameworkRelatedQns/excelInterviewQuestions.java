package frameworkRelatedQns;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.XSSFWorkbook;

public class excelInterviewQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file =    new File("E:\\TestData\\TestData.xls");

        
        FileInputStream inputStream = new FileInputStream(file);

        
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);

        
        XSSFSheet sheet=wb.getSheet("STUDENT_DATA");
        
        
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        
       
        for(int i=0;i<=rowCount;i++){
            
            
            int cellcount=sheet.getRow(i).getLastCellNum();
            
            
            System.out.println("Row"+ i+" data is :");
            
            for(int j=0;j<cellcount;j++){
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
            }
            System.out.println();
        }

	}

}
