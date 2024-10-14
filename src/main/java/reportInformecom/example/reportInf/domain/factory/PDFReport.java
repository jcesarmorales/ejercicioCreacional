package reportInformecom.example.reportInf.domain.factory;

public class PDFReport implements Report {
    @Override
    public String generate() {
        return "Generando informe en PDF";
    }
}
