package com.company;

import java.util.Set;

/**
 * Created by Gimpei on 2014/10/18.
 */
public class FixedEnums {
}

enum Operation{
    PLUS("plus"){
        public String apply(){ return "plus"; }
    },MINUS("minus"){
        public String apply(){ return "minus"; }
    };
    private final String symbol;
    Operation(String symbol) {
        this.symbol = symbol;
    }
    @Override public String toString(){ return symbol; }
    abstract String apply();
}

class Text{
    public enum Style{BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}
    public void applyStyles(Set<Style> styles){
    }
}

/**
 * 順序インデックスの代わりにEnumMapを使用する
 */
class Herb{
    public enum Type{ ANNUAL, PERENNIAL, BIENNIAL}
    private final String name;
    private final Type type;
    Herb(String name, Type type){
        this.name = name;
        this.type = type;
    }
    @Override public String toString(){
        return name;
    }
}