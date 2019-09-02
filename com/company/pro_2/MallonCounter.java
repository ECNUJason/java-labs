package com.company.pro_2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MallonCounter {
    private Map<Bond, Integer> counter;

    public MallonCounter(){
        counter = new HashMap<>();
    }

    public void add(Bond bond){
        if(counter.containsKey(bond)){
            counter.put(bond, counter.get(bond) +1 );
        } else {
            counter.put(bond, 1);
        }
    }

    public int lookUp(Bond  bond){
        if(counter.containsKey(bond)){return counter.get(bond);}
        else return 0;
    }


    public static void main(String[] args){
        MallonCounter mCounter = new MallonCounter();
        LocalDate date = LocalDate.now();
        Bond bond = new Bond("hothot",34.23, date);
        for(int i = 0;i<100; i++){
            mCounter.add(bond);
        }
        System.out.println(mCounter.lookUp(bond));
    }
}
