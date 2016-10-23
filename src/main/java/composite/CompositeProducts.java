package composite;

import java.util.List;

public class CompositeProducts implements Component {
    private final List<Component> components;

    public CompositeProducts(List<Component> components) {

        this.components = components;
    }

    @Override
    public double price() {
        return components.stream()
                .mapToDouble(x -> x.price()).sum();
    }
}
