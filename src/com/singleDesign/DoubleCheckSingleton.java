package com.singleDesign;

public class DoubleCheckSingleton {
//    双重检查
    private DoubleCheckSingleton(){}
    private volatile static DoubleCheckSingleton doubleCheckSingleton;
    public static DoubleCheckSingleton getInstance(){
        if (doubleCheckSingleton == null){
            synchronized (DoubleCheckSingleton.class){
                if (doubleCheckSingleton == null){
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
