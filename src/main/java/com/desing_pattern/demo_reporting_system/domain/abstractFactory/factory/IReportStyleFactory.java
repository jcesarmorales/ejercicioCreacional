package com.desing_pattern.demo_reporting_system.domain.abstractFactory.factory;

import com.desing_pattern.demo_reporting_system.domain.abstractFactory.IDetailedReport;
import com.desing_pattern.demo_reporting_system.domain.abstractFactory.IStandardReport;
import com.desing_pattern.demo_reporting_system.domain.abstractFactory.ISummaryReport;

public interface IReportStyleFactory {
    IStandardReport createStandardReport();
    IDetailedReport createDetailedReport();
    ISummaryReport createSummaryReport();
}
