package com.desing_pattern.demo_reporting_system.domain.abstractFactory.factory;

import com.desing_pattern.demo_reporting_system.domain.abstractFactory.*;

public class ExcelReportFactory implements IReportStyleFactory{
    @Override
    public IStandardReport createStandardReport() {
        return new ExcelStandardReport();
    }

    @Override
    public IDetailedReport createDetailedReport() {
        return new ExcelDetailedReport();
    }

    @Override
    public ISummaryReport createSummaryReport() {
        return new ExcelSummaryReport();
    }
}
