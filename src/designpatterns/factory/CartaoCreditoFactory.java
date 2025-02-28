package designpatterns.factory;

public class CartaoCreditoFactory {

    private CartaoCredito getInstance(int taxa) {

        switch (taxa) {
            case 1 -> new Inter();
            case 2 -> new Bradesco();
            default -> throw new IllegalArgumentException("Não há bancos com essas taxas");
        }

        throw new RuntimeException();

    }

}

