package com.example.demo.single;

public class single2 {
  private static single2 obj=new single2();
  private single2(){
	  
  }
  public static synchronized single2 getObj(){
	  return obj;
  }
}
