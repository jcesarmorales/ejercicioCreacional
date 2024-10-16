package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

public class PDFSummaryReport implements ISummaryReport{
    @Override
    public String createSummary(String content) {
        return "====================\nPDF Summary Report\n====================\n" + content + "\n* Summary of Data *\n";
    }
}
