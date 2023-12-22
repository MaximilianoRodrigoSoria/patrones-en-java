package org.example.creacion.abstract_factory.implementacion;

public interface AbstractFactory <T, R>{
    T create(R type);
}
