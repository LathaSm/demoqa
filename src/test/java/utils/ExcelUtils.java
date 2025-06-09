package utils;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
    private Workbook workbook;
    private Sheet sheet;

    // Constructor to load Excel file
    public ExcelUtils(String filePath, String sheetName) throws Exception {
        FileInputStream file = new FileInputStream(filePath);
        workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheet(sheetName);

        // Ensure the sheet exists
        if (sheet == null) {
            throw new IllegalArgumentException("Sheet '" + sheetName + "' not found in Excel file.");
        }
    }

    // Method to fetch all rows
    public Object[][] getAllRows() {
        int rowCount = sheet.getPhysicalNumberOfRows();
        Object[][] data = new Object[rowCount - 1][6];

        for (int i = 1; i < rowCount; i++) { // Skipping headers
            Row row = sheet.getRow(i);

            data[i - 1][0] = getCellValue(row.getCell(0)); // First Name
            data[i - 1][1] = getCellValue(row.getCell(1)); // Last Name
            data[i - 1][2] = getCellValue(row.getCell(2)); // Email
            data[i - 1][3] = getCellValue(row.getCell(3)); // Mobile
            data[i - 1][4] = getCellValue(row.getCell(4)); // DOB
            data[i - 1][5] = getCellValue(row.getCell(5)); // Current Address
        }

        return data;
    }

    public void closeWorkbook() throws Exception {
        workbook.close();
    }

    // Helper method to handle different data types
    private String getCellValue(Cell cell) {
        if (cell == null) return "";

        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return new SimpleDateFormat("MM/dd/yyyy").format(cell.getDateCellValue());
                }
                return String.valueOf((long) cell.getNumericCellValue()); // Convert numeric to String
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case BLANK:
                return "";
            default:
                return cell.toString();
        }
    }
}