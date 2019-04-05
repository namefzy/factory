package com.gupao.pattern.factory.factoryMethod;

import com.gupao.pattern.factory.model.Cat;
import com.gupao.pattern.factory.simple.Behavior;

public class CatFactory implements AnimalFactory{
    public Behavior create() {
        return new Cat();
    }
}
