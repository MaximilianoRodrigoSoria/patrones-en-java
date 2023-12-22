package org.example.creacion.abstract_factory.implementacion.payment;

public class GooglePayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pagando con Google Payment");
    }
}
