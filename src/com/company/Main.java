package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.*;

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

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test{
}

public class Main {
    /**
     * 関数の説明をがっちり書く
     * @param m 正でなければならない
     * @return　mのモジュラス値
     * @throws java.lang.ArithmeticException m <= 0の場合
     */
    public BigInteger mod(BigInteger m){
        if( m.signum() <= 0)
            throw new ArithmeticException("Modulus <= 0:" + m );
        return BigInteger.TEN;
    }
    public static void main(String[] args) {
	  String s = "something";
      System.out.println(s);
      MapInterface<String, String> m = new AMap();
      m.push("key", "value");
      System.out.println(m.get("key") );

      for( Operation o : Operation.values() )
          System.out.println(o.toString());

      //BitFieldの代わりにEnumSetを利用する
      Text text = new Text();
      text.applyStyles(EnumSet.of(Text.Style.BOLD, Text.Style.ITALIC));

      //順序インデックスの代わりにEnumMapを利用する
      Map<Herb.Type, Set<Herb>> herbsByType = new EnumMap<Herb.Type, Set<Herb>>(Herb.Type.class);
      for(Herb.Type t : Herb.Type.values())
          herbsByType.put(t, new HashSet<Herb>());
      System.out.println(herbsByType);
    }
}
