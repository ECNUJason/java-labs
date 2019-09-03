package com.company.lab11.pro_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class FPlay {
    public class AddBoth implements BiFunction<Integer, Integer, Integer> {
        @Override
        public Integer apply(Integer a, Integer b){
            return a+b;
        }
    }

    public class SubtractBoth implements BiFunction<Integer, Integer, Integer>{
        @Override
        public Integer apply(Integer a, Integer b){
            return a-b;
        }
    }

    public class PowerBoth implements BiFunction<Integer, Integer, Integer>{
        @Override
        public Integer apply(Integer a, Integer b){
            return (int)(Math.pow(a,b));
        }
    }

    public void process(String operator, int a, int b){
        int result;
        BiFunction<Integer, Integer, Integer> f;
        switch(operator){
            case("add"):
                f = new AddBoth();
                break;
            case ("subtract"):
                f = new SubtractBoth();
                break;
            case ("power"):
                f= new PowerBoth();
                break;
            default:
                f= null;
                break;
        }
        if(null != f){
            System.out.println(f.apply(a,b));
        }
    }


    public static void main(String[] args){
        int a = 2;
        int b = 4;
        FPlay fPlay = new FPlay();
        Stream.of("add","subtract","power").forEach(operator->fPlay.process(operator, a,b));
    }
}

