
package org.example.creacion.factory.implementacion;

public class DebitCardPayment implements Payment{
    @Override
    public void doPayment() {
        System.out.println("Pagando con tarjeta de debito");
    }
}
