package reportInformecom.example.reportInf.domain.abstractFactory;

public class HTMLStandardReport implements StandardReport{
    @Override
    public String createStardard() {
        return "Informe estándar en HTML";
    }
}
