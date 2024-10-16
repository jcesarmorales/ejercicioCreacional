package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

public class HTMLDetailedReport implements IDetailedReport{
    @Override
    public String createDetailed(String content) {
        return "HTML Detailed Report: " + content;
    }
}
