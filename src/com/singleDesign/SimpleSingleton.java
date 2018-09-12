package com.singleDesign;

public class SimpleSingleton {
//    懒汉式
    private SimpleSingleton(){

    }
    private static SimpleSingleton singleton;
    public static SimpleSingleton getInstance(){
        if (singleton == null){
            singleton = new SimpleSingleton();
        }
        return singleton;
    }
}
