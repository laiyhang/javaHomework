package com.example.demo.single;

public class single {
	private static single obj;
private single(){
	}
public static synchronized single getsingle(){
	if(obj==null){
		obj=new single();
	}
	return obj;
}
}
