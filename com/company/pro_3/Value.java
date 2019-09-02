package com.company.pro_3;

public enum Value {
    C2('2',1),
    C3('3',2),
    C4('4',3),
    C5('5',4),
    C6('6',5),
    C7('7',6),
    C8('8',7),
    C9('9',8),
    CT('T',9),
    CJ('J',10),
    CQ('Q',11),
    CK('K',12),
    CA('A',13);
    private char c;
    private int priority;

    private Value(char _c, int _priority){c = _c; priority = _priority;}

    public char getCharSymbol(){return c;}
    public int getPriority(){return priority;}
    public String toString(){return ""+c;}
    public boolean equals(Value other){
        return c==other.c;
    }
}
