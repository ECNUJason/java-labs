package com.company.pro_3;

public enum Suit {
    S('\u2660',4),
    H('\u2665',3),
    D('\u2666',2),
    C('\u2663',1);

    private char symbol;
    private int priority;

    private Suit(char _symbol, int _priority){
        symbol = _symbol;
        priority = _priority;
    }

    public char getCharSymbol(){return symbol;}
    public int getPriority(){return priority;}

    public boolean equals(Suit other){
        if(this==other)return true;
        if(!(other instanceof Suit)) return false;
        return this.symbol==other.symbol;
    }

    public String toString(){return "" + symbol;}
}
