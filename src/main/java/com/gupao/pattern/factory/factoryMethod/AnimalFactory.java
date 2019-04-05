package com.gupao.pattern.factory.factoryMethod;

import com.gupao.pattern.factory.simple.Behavior;

/**
 * 工厂模式
 * 管理类复杂
 */
public interface AnimalFactory {
    Behavior create();
}
