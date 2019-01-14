package com.salemove.androidbundle;

import java.util.UUID;

public class Main {
    String helloWorld= "Hello World";
    public String HelloWorldString(){
        return helloWorld;
    }
    public String RandomString(){
        return  UUID.randomUUID().toString();
    }
}
