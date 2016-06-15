package factory;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Factory_ {

    private MovieFactory movieFactory;

    @Before
    public void setUp() throws Exception {
        movieFactory = new MovieFactory();

    }

    @Test
    public void when_we_use_the_factory_with_Terror_parameters_it_should_return_a_object_instance_of_TerrorMovie() throws Exception {
        Object movie = movieFactory.get(MovieType.TERROR);

        assertThat(movie,is(instanceOf(TerrorMovie.class)));
    }

    @Test
    public void when_we_use_the_factory_with_Drama_parameters_it_should_return_a_object_instance_of_DramaMovie() throws Exception {
        Object movie = movieFactory.get(MovieType.DRAMA);

        assertThat(movie,is(instanceOf(DramaMovie.class)));
    }

    @Test
    public void when_we_use_the_factory_with_Action_parameters_it_should_return_a_object_instance_of_ActionMovie() throws Exception {
        Object movie = movieFactory.get(MovieType.ACTION);

        assertThat(movie,is(instanceOf(ActionMovie.class)));
    }

    @Test
    public void when_we_use_the_factory_with_Adventures_parameters_it_should_return_a_object_instance_of_AdventureMovie() throws Exception {
        Object movie = movieFactory.get(MovieType.ADVENTURES);

        assertThat(movie,is(instanceOf(AdventuresMovie.class)));
    }
}
