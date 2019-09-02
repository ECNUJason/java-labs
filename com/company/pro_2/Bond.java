package com.company.pro_2;

import java.time.LocalDate;

public class Bond {
    private String symbol;
    private Double price;
    private LocalDate maturityDate;


    public Bond(String _s, Double _p, LocalDate _m){
        symbol = _s;
        price = _p;
        maturityDate = _m;
    }

    public boolean equals(Bond bond){
        if(this==bond) return true;
        if(!(bond instanceof Bond)){ return false;}
        return (this.symbol == bond.symbol && this.price==bond.price);
    }

}
