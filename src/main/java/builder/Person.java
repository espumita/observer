package builder;

import java.time.LocalDate;

public class Person {
    private String name;
    private String alias;
    private LocalDate dateOfBirth;
    private String gender;

    public String name() {
        return name;
    }

    public String alias() {
        return alias;
    }

    public LocalDate dateOfBirth() {
        return dateOfBirth;
    }

    public String gender() {
        return gender;
    }

    public Person(String name, String gender, String alias, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.alias = alias;
        this.dateOfBirth = dateOfBirth;
    }
}