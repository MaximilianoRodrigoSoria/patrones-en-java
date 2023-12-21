package org.example.creacion.factory.implementacion;

public class Main {

    public static void main(String[] args) {
        testFactory();
    }

    private static void testFactory(){
        Payment payment = PaymentFactory.buildPayment(TypePayment.DEBIT_CARD);
        payment.doPayment();
    }
}
