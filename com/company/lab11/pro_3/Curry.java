package com.company.lab11.pro_3;

import java.util.function.Function;
import java.util.stream.Stream;

public class Curry {
    public  Function<Double, Double>  curreyAdd(Double a){
        return new Function<Double,Double>(){
            @Override
            public Double apply(Double x) {
                return x + a;
            }
        };
    }


    public static void main(String[] args){
        Curry curry = new Curry();
        Function<Double, Double> f = curry.<Double>curreyAdd((double)3);
        Stream.of(1,2,3,4,5,6,7,8).map(i->f.apply((double)i)).forEach(System.out::println);
    }
}
