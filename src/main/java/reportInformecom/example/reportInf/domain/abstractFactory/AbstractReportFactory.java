package reportInformecom.example.reportInf.domain.abstractFactory;

public interface AbstractReportFactory {

    StandardReport createStandardReport();
    DetailedReport createDetailedReport();
    SummaryReport createSummaryReport();

}
