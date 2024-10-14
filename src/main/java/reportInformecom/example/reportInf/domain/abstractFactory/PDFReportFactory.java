package reportInformecom.example.reportInf.domain.abstractFactory;

public class PDFReportFactory implements AbstractReportFactory{
    @Override
    public StandardReport createStandardReport() {
        return new PDFStandardReport();
    }

    @Override
    public DetailedReport createDetailedReport() {
        return new PDFDetailedReport();
    }

    @Override
    public SummaryReport createSummaryReport() {
        return new PDFSummaryReport();
    }
}
