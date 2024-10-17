package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelStandardReport implements IStandardReport{
    @Override
    public String createStandard(String content) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Informe Estandar en Excel");

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Informe Estándar en Excel");
        Row contentRow = sheet.createRow(1);
        contentRow.createCell(0).setCellValue(content);

        try (FileOutputStream fileOut = new FileOutputStream("ExcelInformeEstandar.xlsx")) {
            workbook.write(fileOut);
            workbook.close();
            return "Informe Estándar en Excel generado con éxito!";
        } catch (IOException e) {
            return "Error al generar el Informe Estándar en Excel: " + e.getMessage();
        }
    }
}
