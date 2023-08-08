package net.media.training.designpattern.builder;

public class Person {
    private String name;
    private int id;
    private String city;
    private String country;

    // Private constructor to enforce the use of the builder
    private Person(String name, int id, String city, String country) {
        this.name = name;
        this.id = id;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    // Builder class
    public static class Builder {
        private String name;
        private int id;
        private String city;
        private String country;

        public Builder(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Person build() {
            return new Person(name, id, city, country);
        }
    }
}
