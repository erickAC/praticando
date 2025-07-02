package designpatterns.strategy;

import java.math.BigDecimal;

public interface CartaoCreditoStrategy {

    public BigDecimal calcularTaxa(BigDecimal valor);

}
