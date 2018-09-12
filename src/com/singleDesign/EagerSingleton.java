package com.singleDesign;

public class EagerSingleton {
//    饱汉式
    private EagerSingleton(){}
    private static EagerSingleton eagerSingleton = new EagerSingleton();
    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }
}
