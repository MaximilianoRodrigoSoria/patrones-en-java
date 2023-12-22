package org.example.creacion.abstract_factory.implementacion.payment;

import org.example.creacion.abstract_factory.implementacion.AbstractFactory;

public class PaymentFactory implements AbstractFactory<Payment, TypePayment> {


    @Override
    public Payment create(TypePayment typePayment) {
        switch (typePayment) {
            case CREDIT_CARD:
                return new CreditCardPayment();
            case DEBIT_CARD:
                return new DebitCardPayment();
            case GOOGLEPAY:
                return new GooglePayment();
            default:
                return new CreditCardPayment();
        }
    }
}