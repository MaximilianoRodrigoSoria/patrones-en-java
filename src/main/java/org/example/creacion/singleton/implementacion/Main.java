package org.example.creacion.singleton.implementacion;

public class Main {

    public static void main(String[] args) {
        probarSinglenton();
    }


    private static void probarSinglenton(){
        Card card = Card.getINSTANCE();
        card.setCardNumber("1234-1234-1234-1324");
        Card card2 = Card.getINSTANCE();
        System.out.println(Card.getINSTANCE().getCardNumber());

        System.out.println(card2.equals(card));
    }
}
