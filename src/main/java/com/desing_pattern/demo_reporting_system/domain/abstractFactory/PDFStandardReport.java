package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

public class PDFStandardReport implements IStandardReport{
    @Override
    public String createStandard(String content) {
        return "====================\nPDF Standard Report\n====================\n" + content;
    }
}
