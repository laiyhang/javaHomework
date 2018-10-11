package com.example.demo.single;

import java.util.ArrayList;


public class many {
private static many many1=new many();
private static many many2=new many();
private static ArrayList<many> set= new ArrayList<many>();
private many(){}
static{
	
	set.add(many1);
	set.add(many2);
}
public static many getobject(int index){
	return set.get(index);
}
}
