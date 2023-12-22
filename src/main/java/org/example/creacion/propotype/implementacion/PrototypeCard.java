package org.example.creacion.propotype.implementacion;

public interface PrototypeCard extends Cloneable {

    void getCard();

    PrototypeCard clone() throws CloneNotSupportedException;
}