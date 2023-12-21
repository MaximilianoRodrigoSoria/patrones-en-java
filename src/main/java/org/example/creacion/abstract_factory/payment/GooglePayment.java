package org.example.creacion.abstract_factory.payment;

public class GooglePayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pagando con Google Payment");
    }
}
