package com.singleDesign;

public class SafeSingleton {
//    懒汉式加synchronized关键字
    private SafeSingleton(){

    }
    private static SafeSingleton safeSingleton;
    public static synchronized SafeSingleton getInstance(){
        if (safeSingleton == null){
            safeSingleton = new SafeSingleton();
        }
        return safeSingleton;
    }
}
