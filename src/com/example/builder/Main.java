package com.example.builder;

public class Main {
    public static void main(String[] args) {
        new EmailService().sendWelcomeEmail();
        new UserMigrationService().migrateUser();
        new LoginService().registerUser("Pranav",32,"pranav@gmail.com");

    }
}
