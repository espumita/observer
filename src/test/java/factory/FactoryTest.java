package factory;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryTest {

    private MovieFactory movieFactory;

    @Before
    public void setUp() {
        movieFactory = new MovieFactory();

    }

    @Test
    public void when_we_use_the_factory_with_Terror_parameters_it_should_return_a_object_instance_of_TerrorMovie() {
        Object movie = movieFactory.get(MovieType.TERROR);

        assertThat(movie).isInstanceOf(TerrorMovie.class);
    }

    @Test
    public void when_we_use_the_factory_with_Drama_parameters_it_should_return_a_object_instance_of_DramaMovie() {
        Object movie = movieFactory.get(MovieType.DRAMA);

        assertThat(movie).isInstanceOf(DramaMovie.class);
    }

    @Test
    public void when_we_use_the_factory_with_Action_parameters_it_should_return_a_object_instance_of_ActionMovie() {
        Object movie = movieFactory.get(MovieType.ACTION);

        assertThat(movie).isInstanceOf(ActionMovie.class);
    }

    @Test
    public void when_we_use_the_factory_with_Adventures_parameters_it_should_return_a_object_instance_of_AdventureMovie() {
        Object movie = movieFactory.get(MovieType.ADVENTURES);

        assertThat(movie).isInstanceOf(AdventuresMovie.class);
    }
}
