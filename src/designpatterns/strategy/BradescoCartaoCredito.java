package designpatterns.strategy;

import java.math.BigDecimal;

public class BradescoCartaoCredito implements CartaoCreditoStrategy{
    @Override
    public BigDecimal calcularTaxa(BigDecimal valor) {
        return valor;
    }
}
