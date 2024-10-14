package reportInformecom.example.reportInf.domain.factory;

public class HTMLReport implements Report {
    @Override
    public String generate() {
        return "Generando informe en HTML";
    }
}
