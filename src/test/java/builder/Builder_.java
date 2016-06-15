package builder;

import org.junit.Test;

import static java.time.LocalDate.now;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Builder_ {
    @Test
    public void when_we_build_and_object_we_should_get_and_object_instance() throws Exception {
        Object person = new PersonBuilder()
                            .withName("Jhon")
                            .withAlias("J")
                            .bornIn(now())
                            .gender("Male")
                            .build();

        assertThat(person, is(instanceOf(Person.class)));
    }
}
