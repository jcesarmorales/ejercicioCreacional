package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

public class ExcelStandardReport implements IStandardReport{
    @Override
    public String createStandard(String content) {
        return "====================\nExcel Standard Report\n====================\n" + content;
    }
}
