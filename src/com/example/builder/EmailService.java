package com.example.builder;

public class EmailService {

    public void sendWelcomeEmail()
    {
        User user = new User.UserBuilder()
                .setName("Pradip")
                .setAge(31)
                .setEmail("pradip@gmail.com")
                .setCity("Pune")
                .build();
        System.out.println("Welcome email sent to -> "+user);
    }
}
