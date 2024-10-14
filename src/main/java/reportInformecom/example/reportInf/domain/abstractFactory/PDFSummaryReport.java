package reportInformecom.example.reportInf.domain.abstractFactory;

public class PDFSummaryReport implements SummaryReport{
    @Override
    public String createSummary() {
        return "Informe resumen en PDF";
    }
}


