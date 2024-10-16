package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

public class PDFDetailedReport implements IDetailedReport{
    @Override
    public String createDetailed(String content) {
        return "====================\nPDF Detailed Report\n====================\n" + content + "\n* Detailed Information *\n";
    }
}
