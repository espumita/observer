package composite;

import java.util.*;

public class Cart {

    private List<Product> products = new ArrayList();

    public double totalPrice() {
        return products.stream()
                .mapToDouble(x -> x.price()).sum();
    }

    public void add(Product product) {
        products.add(product);
    }
}
