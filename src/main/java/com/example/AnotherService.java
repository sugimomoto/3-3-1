package com.example;

public class AnotherService extends AbstractBaseService {

    public AnotherService(String name) {
        super(name);
    }

    @Override
    public String say(){
        return name;
    }
    
    
}
