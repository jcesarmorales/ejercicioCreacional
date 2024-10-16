package com.desing_pattern.demo_reporting_system.domain.abstractFactory.factory;

import com.desing_pattern.demo_reporting_system.domain.abstractFactory.*;

public class HTMLReportFactory implements IReportStyleFactory{
    @Override
    public IStandardReport createStandardReport() {
        return new HTMLStandardReport();
    }

    @Override
    public IDetailedReport createDetailedReport() {
        return new HTMLDetailedReport();
    }

    @Override
    public ISummaryReport createSummaryReport() {
        return new HTMLSummaryReport();
    }
}
