package com.example.design;

public class EmailTemplate implements Template{
    @Override
    public void format() {
        System.out.println("Email formatting");
    }
}
