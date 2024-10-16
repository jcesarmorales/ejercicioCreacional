package com.desing_pattern.demo_reporting_system.domain.factoryMethod;

public class PDFReport implements IReport{
    @Override
    public String generate(String content) {
        return "====================\nPDF Report\n====================\n" + content;
    }
}
