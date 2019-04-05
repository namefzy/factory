package com.gupao.pattern;

import static org.junit.Assert.assertTrue;

import com.gupao.pattern.factory.simple.BehaviorFactory;
import com.gupao.pattern.factory.model.Cat;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        BehaviorFactory behavior = new BehaviorFactory();
//        behavior.create();
        behavior.create(Cat.class).eat();
    }
}
