package reportInformecom.example.reportInf.domain.factory;

public class ConcreteReportFactory extends ReportFactory{

    @Override
    public Report createReport(String type) {
        switch (type.toLowerCase()) {
            case "pdf":
                return new PDFReport();
            case "excel":
                return new ExcelReport();
            case "html":
                return new HTMLReport();
            default:
                throw new IllegalArgumentException("Formato no soportado");
        }
    }
}
