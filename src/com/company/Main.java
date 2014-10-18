package com.company;

import java.lang.reflect.Type;
import java.util.HashMap;

interface MapInterface<T, K>{
    //public static Type type = T.class;
    public void push(T k, K v);
    public String get(T k);
}

class AMap implements MapInterface<String, String> {
    private HashMap<String, String> m = new HashMap<>();
    @Override
    public void push(String k, String v){
        m.put(k, v);
    }
    @Override
    public String get(String k){
        return m.get(k);
    }
}

public class Main {
    public static void main(String[] args) {
	  String s = "something";
      System.out.println(s);
      MapInterface<String, String> m = new AMap();
      m.push("key", "value");
      System.out.println(m.get("key") );

      for( Operation o : Operation.values() )
          System.out.println(o.toString());
    }
}
