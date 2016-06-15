package fluent;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FluentClass_ {
    @Test
    public void when_we_initialize_an_object_using_fluent_api_concept_we_should_get_the_object_instance() throws Exception {
        String[][] params = {
                {"name", "Jhon"},
                {"age", "14"}
        };
        String[][] headers = {
                {"Content-Type", "Application/json"}
        };
        PostRequest normalObject = new PostRequest("some-host.com", "/user", "80", params, headers);



        PostRequest fluentObject = postTo("some-host.com")
                .andPath("/user")
                .toPort(80)
                .withHeader("Content-Type", "Application/json")
                .withParam("name","Jhon")
                .withParam("age", 14)
                .getRequest();



        assertThat(normalObject, is(fluentObject));
    }

    private FluentClass postTo(String host) {
        return new FluentClass().preparePostToHost(host);
    }
}
