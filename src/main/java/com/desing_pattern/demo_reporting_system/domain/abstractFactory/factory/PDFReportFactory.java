package com.desing_pattern.demo_reporting_system.domain.abstractFactory.factory;

import com.desing_pattern.demo_reporting_system.domain.abstractFactory.*;

public class PDFReportFactory implements IReportStyleFactory{
    @Override
    public IStandardReport createStandardReport() {
        return new PDFStandardReport();
    }

    @Override
    public IDetailedReport createDetailedReport() {
        return new PDFDetailedReport();
    }

    @Override
    public ISummaryReport createSummaryReport() {
        return new PDFSummaryReport();
    }
}
