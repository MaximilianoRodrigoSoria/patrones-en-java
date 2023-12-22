package org.example.creacion.abstract_factory.implementacion;

import org.example.creacion.abstract_factory.implementacion.card.CardFactory;
import org.example.creacion.abstract_factory.implementacion.payment.PaymentFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(TypeFactory typeFactory){
        switch (typeFactory) {
            case CARD:
                return new CardFactory();
            case PAYMENT:
                return new PaymentFactory();

            default:
                return null;
        }
    }
}
