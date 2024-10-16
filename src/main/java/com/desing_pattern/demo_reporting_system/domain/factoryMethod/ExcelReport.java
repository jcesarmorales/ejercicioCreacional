package com.desing_pattern.demo_reporting_system.domain.factoryMethod;

public class ExcelReport implements IReport{
    @Override
    public String generate(String content) {
        return "====================\nExcel Report\n====================\n" + content.replace("\n", "\t");
    }
}
