package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

public class HTMLSummaryReport implements ISummaryReport{
    @Override
    public String createSummary(String content) {
        return "HTML Summary Report: " + content;
    }
}
