package org.example.creacion.abstract_factory.implementacion;

import org.example.creacion.abstract_factory.implementacion.card.Card;
import org.example.creacion.abstract_factory.implementacion.card.TypeCard;
import org.example.creacion.abstract_factory.implementacion.payment.Payment;
import org.example.creacion.abstract_factory.implementacion.payment.TypePayment;

public class Main {

    public static void main(String[] args) {
        callFactories();

    }

    private static void callFactories(){

        AbstractFactory cardFactory = FactoryProvider.getFactory(TypeFactory.CARD);
        Card card = (Card)cardFactory.create(TypeCard.VISA);
        System.out.println(card.getName());

        AbstractFactory paymentFactory = FactoryProvider.getFactory(TypeFactory.PAYMENT);
        Payment payment = (Payment) paymentFactory.create(TypePayment.GOOGLEPAY);
        payment.doPayment();

    }
}
