package reportInformecom.example.reportInf.domain.abstractFactory;

public class ExcelSummaryReport implements SummaryReport{
    @Override
    public String createSummary() {
        return "Informe resume en Excel";
    }
}
