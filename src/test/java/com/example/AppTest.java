package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        assertTrue( true );
    }

    @Test
    public void checkObject(){
        FooService foo = new FooService("Hello");

        assertTrue("同じClassなので true",foo instanceof FooService);
        
        assertTrue("親クラスなので true",foo instanceof AbstractBaseService);

        assertTrue("インターフェースを実装しているので true",foo instanceof BaseService);

        // assertFalse("継承関係が無いので false", foo instanceof AnotherService);

        
        if (foo instanceof FooService){
            FooService service = (FooService)foo;
            assertEquals("Hello", service.say());
        }

    }

    @Test
    public void fooSay(){
        FooService foo = new FooService("Hello");

        assertEquals("Hello", foo.say());
    }
}
