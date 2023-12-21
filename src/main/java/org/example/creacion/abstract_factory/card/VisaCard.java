package org.example.creacion.abstract_factory.card;

public class VisaCard implements Card {

    @Override
    public String getName() {
        return TypeCard.VISA.name();
    }

    @Override
    public String getNumber() {
        return "0000 0000 0000 0002";
    }

}