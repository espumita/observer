package composite;

public class SingleProduct implements  Component{
    private final String name;
    private final double price;

    public SingleProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double price() {
        return price;
    }
}
