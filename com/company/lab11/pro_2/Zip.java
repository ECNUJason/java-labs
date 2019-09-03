package com.company.lab11.pro_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class Zip<T>  implements BiFunction<List<? extends T>, List<? extends T>, List<List<? super T>>> {

    @Override
    public List<List<? super T>> apply(List<? extends T> l1, List<? extends T> l2) {
        List<List<? super T>> r = new ArrayList<>();
        for(int i =0;i<l1.size();i++){
            List<T> pairList = new ArrayList<>();
            pairList.add(l1.get(i));
            pairList.add(l2.get(i));
            r.add(pairList);
        }
        return r;
    }


    public static void main(String[] args){
        Zip<String> zip = new Zip<>();
        List<String> l1 = Arrays.asList("1","2", "3");
        List<String> l2 = Arrays.asList("4","5","6");
        zip.apply(l1,l2).stream().forEach(System.out::println);
    }
}
