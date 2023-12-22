package org.example.creacion.propotype.implementacion;

import static org.example.creacion.propotype.implementacion.PrototypeFactory.CartType.AMEX;
import static org.example.creacion.propotype.implementacion.PrototypeFactory.CartType.VISA;

public class Main {

    public static void main(String[] args) {
        probarPrototype();
    }

    private static void probarPrototype(){
        PrototypeFactory.loadCard();
        try {
            PrototypeCard visa = PrototypeFactory.getInstance(VISA);
            visa.getCard();

            PrototypeCard amex = PrototypeFactory.getInstance(AMEX);
            amex.getCard();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
