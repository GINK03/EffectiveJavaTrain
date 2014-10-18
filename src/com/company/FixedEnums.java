package com.company;

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
