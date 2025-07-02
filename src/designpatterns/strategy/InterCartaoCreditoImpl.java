package designpatterns.strategy;

import java.math.BigDecimal;

public class InterCartaoCreditoImpl implements CartaoCreditoStrategy {
    @Override
    public BigDecimal calcularTaxa(BigDecimal valor) {
        return valor.add(BigDecimal.valueOf(1.0));
    }
}
