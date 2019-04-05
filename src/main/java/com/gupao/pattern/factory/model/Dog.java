package com.gupao.pattern.factory.model;

import com.gupao.pattern.factory.simple.Behavior;

public class Dog implements Behavior {

    public void eat() {
        System.out.println("狗吃粮食");
    }
}
