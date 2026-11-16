package com.example.builder;

public class LoginService {

    void registerUser(String name,int age,String email)
    {
        User user = new User.UserBuilder()
                .setName(name)
                .setAge(age)
                .setEmail(email)
                .build();
        System.out.println("User Registered Successfully ->"+user);
    }
}
