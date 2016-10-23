package composite;

import java.util.List;

public class CompositeProducts implements Product {
    private final List<Product> products;

    public CompositeProducts(List<Product> products) {

        this.products = products;
    }

    @Override
    public double price() {
        return products.stream()
                .mapToDouble(x -> x.price()).sum();
    }
}
