package org.example.creacion.abstract_factory.implementacion.card;

import org.example.creacion.abstract_factory.implementacion.AbstractFactory;

public class CardFactory implements AbstractFactory<Card,TypeCard> {
    @Override
    public Card create(TypeCard type) {
        switch (type) {
            case VISA:
                return new VisaCard();
            case MASTERCARD:
                return new MastercardCard();

            default:
                return new VisaCard();
        }
    }
}
