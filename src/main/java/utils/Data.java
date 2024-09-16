package utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Data
{	
	String file;
    ExcelReader externalData = new ExcelReader();
    
    public String getDataValue(String key) throws IOException, InvalidFormatException 
    {
        file = System.getProperty("user.dir") + "C:\\Eclipse Projects\\Interview\\AutomationExercise\\Files\\AutomationExcerciseData.xlsx";
        List<Map<String, String>> testData = externalData.getData(file, SheetName);
        return testData.get(DataRowNumber).get(key);
    }
    
    public List<String> getAllHeaders() throws IOException, InvalidFormatException
    {
        file = System.getProperty("user.dir") + "C:\\Eclipse Projects\\Interview\\AutomationExercise\\Files\\AutomationExcerciseData.xlsx";
        Sheet sheet = externalData.getSheetByName(file, SheetName);
        int totalColumn = sheet.getRow(0).getLastCellNum();
        Row row = sheet.getRow(0);
        List<String> list = new ArrayList<>();
        for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) 
        {
            String header = externalData.getColumnHeaders(sheet, row, currentColumn);
            list.add(header);
        }
        return list;
    }
}
