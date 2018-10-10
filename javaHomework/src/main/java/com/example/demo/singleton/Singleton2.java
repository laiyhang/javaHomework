package com.example.demo.singleton;

public class Singleton2 {
	//饿汉式单例类.在类初始化时，已经自行实例化   

	    //私有的默认构造子  
	    private Singleton2() {}  
	    //已经自行实例化   
	    private static final Singleton2 single = new Singleton2();  
	    //静态工厂方法   
	    public static Singleton2 getInstance() {  
	        return single;  
	    }  
	
}
