package designpatterns.strategy;

import java.math.BigDecimal;

public class CalcularTaxa {
    private CartaoCreditoStrategy strategy;

    public CalcularTaxa(CartaoCreditoStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CartaoCreditoStrategy cartaoCreditoStrategy) {
        this.strategy = cartaoCreditoStrategy;
    }

    public BigDecimal aplicarTaxa(BigDecimal valor) {
        return strategy.calcularTaxa(valor);
    }

}
