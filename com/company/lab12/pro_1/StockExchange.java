package com.company.lab12.pro_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StockExchange implements Iterable<Stock> {
    private List<Stock> stocks;
    @Override
    public Iterator<Stock> iterator() {
        return new Iterator<Stock>(){
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < stocks.size();
            }

            @Override
            public Stock next() {
                return stocks.get(index++);
            }
        };
    }

    public StockExchange(){
        stocks = Arrays.asList(new Stock("Apple"), new Stock("GE"), new Stock("MS"), new Stock("WowWei"));
    }



    public static void main(String[] args){
        StockExchange stockExchange = new StockExchange();
        for(Stock s: stockExchange){
            System.out.println(s);
        }
    }
}
