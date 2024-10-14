package reportInformecom.example.reportInf.domain.abstractFactory;

public class HTMLSummaryReport implements SummaryReport{
    @Override
    public String createSummary() {
        return "Informe resumen en PDF";
    }
}
