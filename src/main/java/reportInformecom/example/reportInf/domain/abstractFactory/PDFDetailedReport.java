package reportInformecom.example.reportInf.domain.abstractFactory;

public class PDFDetailedReport implements DetailedReport{
    @Override
    public String createDetailed() {
        return "Informe detallado en PDF";
    }
}
