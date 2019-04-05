package com.gupao.pattern.factory.model;

import com.gupao.pattern.factory.simple.Behavior;

public class Cat implements Behavior {

    public void eat() {
        System.out.println("猫吃粮食");
    }
}
