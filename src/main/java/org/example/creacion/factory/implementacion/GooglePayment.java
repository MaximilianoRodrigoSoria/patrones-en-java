package org.example.creacion.factory.implementacion;

public class GooglePayment implements Payment{
    @Override
    public void doPayment() {
        System.out.println("Pagando con Google Payment");
    }
}
