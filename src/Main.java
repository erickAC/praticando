import designpatterns.strategy.BradescoCartaoCredito;
import designpatterns.strategy.CalcularTaxa;
import designpatterns.strategy.InterCartaoCreditoImpl;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CalcularTaxa calcularTaxa = new CalcularTaxa(new BradescoCartaoCredito());
        System.out.println(calcularTaxa.aplicarTaxa(new BigDecimal(10)));

        calcularTaxa = new CalcularTaxa(new InterCartaoCreditoImpl());
        System.out.println(calcularTaxa.aplicarTaxa(new BigDecimal(10)));
    }
}