package com.example.design;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderService {

   public void sendNotification()
   {
       NotificationFactory factory = new SmsFactory();
       Notification notification = factory.createNotification();
       Template template = factory.createTemplate();
       notification.send();
       template.format();
   }

}
