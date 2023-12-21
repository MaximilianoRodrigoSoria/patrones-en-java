package org.example.creacion.factory.implementacion;

public class PaymentFactory {
    public static Payment buildPayment(TypePayment typePayment) {
        switch (typePayment) {
            case CREDIT_CARD:
                return new CreditCardPayment();

            case GOOGLEPAY:
                return new GooglePayment();

            case DEBIT_CARD:
                return new DebitCardPayment();

            default:
                return new CreditCardPayment();
        }
    }
}