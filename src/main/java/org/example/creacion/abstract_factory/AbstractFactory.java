package org.example.creacion.abstract_factory;

public interface AbstractFactory <T, R>{
    T create(R type);
}
