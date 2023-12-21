package org.example.creacion.abstract_factory.payment;

public class CreditCardPayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pagando con tarjeta de credito");
    }
}
