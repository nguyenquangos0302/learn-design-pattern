package model;

public class Person {

    private String name;

    private String username;

    private String email;

    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.username = builder.username;
        this.email = builder.email;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public static class PersonBuilder {

        private String name;

        private String username;

        private String email;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder username(String username) {
            this.username = username;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
