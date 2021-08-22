package com.example;

/**
 * Hello world!
 *　3-3-1 instanceof 演算子
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Object fooService = new FooService("Hello");

        System.out.println(fooService instanceof FooService);
    }
}
