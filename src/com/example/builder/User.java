package com.example.builder;

public class User {
    private String name;
    private int age;
    private String email;
    private String city;

    public void setCity(String city) {
        this.city = city;
    }

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.city = builder.city;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public static class UserBuilder {
        String name;
        int age;
        String email;
        String city;

        public UserBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        User build(){
            return new User(this);
        }
    }
}

