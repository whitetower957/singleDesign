package com.singleDesign;

public class StaticSingleton {
//    登记式,利用类加载机制，不过是lazy的
    private StaticSingleton(){}

    private static class SingleHolder{
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }
    public static final StaticSingleton getInstance(){
        return SingleHolder.INSTANCE;
    }


}
