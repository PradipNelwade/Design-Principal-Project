package com.example.builder;

public class UserMigrationService {

    public void migrateUser(){

          User user = new User.UserBuilder()
                  .setName("Rahul")
                  .setAge(30)
                  .setEmail("rahul@gmail.com")
                  .setCity("Pune")
                  .build();
        System.out.println("User migrated -> "+user);
    }
}
