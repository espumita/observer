package composite;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CompositeTest {
    @Test
    public void when_cart_got_multiple_and_single_items_should_provide_total_price() throws Exception {
        Cart cart = new Cart();
        cart.add(new SingleProduct("Bread", 2.50));
        cart.add(givenAnCompositeProductWith(
                new SingleProduct("Pepsi", 5.0),
                new SingleProduct("Water", 2.50),
                givenAnCompositeProductWith(
                        new SingleProduct("More bread", 10.0),
                        new SingleProduct("More Water", 10.0)
                )
        ));

        double totalPrice = cart.totalPrice();

        assertThat(totalPrice).isEqualTo(30.0);
    }

    private CompositeProducts givenAnCompositeProductWith(Product... products) {
        return new CompositeProducts(Arrays.asList(products));
    }
}
