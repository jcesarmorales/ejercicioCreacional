package com.desing_pattern.demo_reporting_system.domain.factoryMethod;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReport implements IReport{
    @Override
    public String generate(String content) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Excel Report");

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Excel Report");
        Row contentRow = sheet.createRow(1);
        contentRow.createCell(0).setCellValue(content);

        try (FileOutputStream fileOut = new FileOutputStream("ExcelReport.xlsx")) {
            workbook.write(fileOut);
            workbook.close();
            return "Excel Report generated successfully!";
        } catch (IOException e) {
            return "Error generating Excel Report: " + e.getMessage();
        }
    }
}
