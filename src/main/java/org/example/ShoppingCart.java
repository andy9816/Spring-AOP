package org.example;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut(String status){
        //Logging
        //Authentication & Authorization
        //Sanitize the Data
        System.out.println("CheckOut Method from ShoppingCart Called");//this is business logic
    }
    public int quantity(){
        return 2;
    }
}
