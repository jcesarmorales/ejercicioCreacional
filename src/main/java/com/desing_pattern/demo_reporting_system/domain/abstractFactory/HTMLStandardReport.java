package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

public class HTMLStandardReport implements IStandardReport{
    @Override
    public String createStandard(String content) {
        return "HTML Standard Report: " + content;
    }
}
