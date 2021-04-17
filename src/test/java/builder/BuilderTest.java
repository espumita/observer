package builder;

import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.*;

public class BuilderTest {

    @Test
    public void when_we_build_and_object_we_should_get_and_object_instance() {
        var person = new PersonBuilder()
                .withName("Jhon")
                .withAlias("J")
                .bornIn(LocalDate.now())
                .gender("Male")
                .build();

        assertThat(person).isInstanceOf(Person.class);
        assertThat(person.name()).isEqualTo("Jhon");
        assertThat(person.alias()).isEqualTo("J");
        assertThat(person.dateOfBirth()).isEqualTo(LocalDate.now());
        assertThat(person.gender()).isEqualTo("Male");
    }
}
