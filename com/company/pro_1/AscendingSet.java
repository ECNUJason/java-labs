package com.company.pro_1;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class AscendingSet {
    private Set<Integer> treeset;
    public AscendingSet(){
        treeset = new TreeSet<>();
        init();
    }

    private void init(){
        Random r = new Random();
        while(treeset.size()<6) {
            treeset.add(r.nextInt(49) + 1);
        }
    }

    public void display(){
        for(Integer i : treeset){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        AscendingSet as = new AscendingSet();
        as.display();
    }
}
