package reportInformecom.example.reportInf.domain.abstractFactory;

public class HTMLDetailedReport implements DetailedReport{
    @Override
    public String createDetailed() {
        return "Informe detallado en HTML";
    }
}
