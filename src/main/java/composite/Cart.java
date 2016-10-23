package composite;

import java.util.*;

public class Cart {

    private List<Component> components = new ArrayList();

    public double totalPrice() {
        return components.stream()
                .mapToDouble(x -> x.price()).sum();
    }

    public void add(Component component) {
        components.add(component);
    }
}
