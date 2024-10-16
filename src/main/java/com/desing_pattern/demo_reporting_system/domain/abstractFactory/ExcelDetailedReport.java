package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

public class ExcelDetailedReport implements IDetailedReport{
    @Override
    public String createDetailed(String content) {
        return "====================\nExcel Detailed Report\n====================\n" + content + "\n* Detailed Information *\n";
    }
}
