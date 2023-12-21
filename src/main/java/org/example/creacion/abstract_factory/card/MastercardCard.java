package org.example.creacion.abstract_factory.card;

public class MastercardCard implements Card{

    @Override
    public String getName() {
        return TypeCard.MASTERCARD.name();
    }

    @Override
    public String getNumber() {
        return "0000 0000 0000 0001";
    }
}
