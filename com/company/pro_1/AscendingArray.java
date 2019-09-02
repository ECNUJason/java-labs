package com.company.pro_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class AscendingArray {
    private ArrayList<Integer> list;
    public AscendingArray(){
        list = new ArrayList<>();
        initList(6);
    }

    private void initList(int size){
        Random r = new Random();
        while(list.size()<size){
            int number = r.nextInt(49)+1;
            if(!list.contains(number))
                list.add(number);
        }
        Collections.sort(list);
    }

    public void display(){
        for(Integer i : list){
            System.out.println(i);
        }
    }


    public static void main(String[] args){
        AscendingArray aa = new AscendingArray();
        aa.display();
    }

}
