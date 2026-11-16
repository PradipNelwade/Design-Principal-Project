package com.example.design;

public class SmsTemplate implements Template{
    @Override
    public void format() {
        System.out.println("Sms formatting");
    }
}
