package com.example.demo.singleton;

import java.util.HashMap;
import java.util.Random;


public class Droid {

private static HashMap<String, Droid> droids = new HashMap<>();
        
public static final String[] names = {"阿尔法狗", "大师"};

private String name;


static{

  Droid alphaGo = new Droid(names[0]);
  droids.put(names[0], alphaGo);


  Droid master = new Droid(names[1]);
  droids.put(names[1], master);
}

private Droid(String name){
  this.name = name;
}

public static Droid getRandomInstance(){
  Random random = new Random();
  int index = random.nextInt(2);
  String name = names[index];
  return droids.get(name);
}

public static Droid getInstance(String name){
  return droids.get(name);
}

public void reply(){
  System.out.println("I am " + name + ", I'm here.");
}
}
