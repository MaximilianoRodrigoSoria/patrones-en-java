
package org.example.creacion.abstract_factory.payment;

public class DebitCardPayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pagando con tarjeta de debito");
    }
}
