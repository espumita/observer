package builder;


import java.time.LocalDate;

public class PersonBuilder {
    private String name;
    private String alias;
    private LocalDate dateOfBirth;
    private String gender;

    public PersonBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public PersonBuilder bornIn(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public PersonBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }

    public Person build() {
        return new Person(name, gender, alias, dateOfBirth);
    }

}