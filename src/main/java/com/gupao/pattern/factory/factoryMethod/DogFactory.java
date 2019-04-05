package com.gupao.pattern.factory.factoryMethod;

import com.gupao.pattern.factory.model.Dog;
import com.gupao.pattern.factory.simple.Behavior;

public class DogFactory implements AnimalFactory{
    @Override
    public Behavior create() {
        return new Dog();
    }
}
