package org.example.creacion.builder.implementacion;

public class Main {

    public static void main(String[] args) {
        probarBuilder();
    }

    private static void probarBuilder(){
        Card card = new Card.CardBuilder("VISA",
                "0000 1111 2222 3333")
                .name("Alberto")
                .expires(2030)
                .credit(true)
                .build();

        System.out.println(card);

        Card card2 = new Card.CardBuilder("AMEX",
                "9999 9999 9999 9999")
                .build();

        System.out.println(card2);
    }
}
