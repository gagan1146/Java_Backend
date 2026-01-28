package com.DependencyInjection.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
class Order{
    public Order(){
        System.out.println("Order Object is created only..");
    }
}

@Component
@Lazy
class Invoice{
    public Invoice(){
        System.out.println("Invoice Object is created Only..");
    }
}

@Component
public class ConstructorInjectionExample1 {
    Order order;
    Invoice invoice;

    public ConstructorInjectionExample1(Invoice invoice){
        this.invoice = invoice;
    }
    @Autowired
    public ConstructorInjectionExample1(Order order){
        this.order = order;
    }

    public static void main(String[] args) {
        System.out.println("Inside main class....");
    }
}
