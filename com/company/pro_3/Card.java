package com.company.pro_3;

import java.util.Set;
import java.util.TreeSet;

public class Card implements Comparable<Card>{
    private Suit suit;
    private Value value;

    public Card(Suit _suit, Value _value){
        suit = _suit;
        value = _value;
    }

    public boolean equals(Card other){
        if(this==other) return true;
        if(!(other instanceof Card)) return false;
        else return suit.equals(other.suit) && value.equals(other.value);
    }

    public int hashCode(){
        return suit.hashCode() + value.hashCode();// can I do it like this?
    }

    public int getPriority(){
        return value.getPriority() * 100 + suit.getPriority();
    }

    @Override
    public int compareTo(Card card) {
        return this.getPriority() - card.getPriority();
    }

    @Override
    public String toString(){
        return ""+suit.getCharSymbol()+value.getCharSymbol();
    }

    public static void main(String[] args){
        Set<Card> cards = new TreeSet<>();
        for(Suit s: Suit.values()){
            for(Value v: Value.values()){
                cards.add(new Card(s,v));
            }
        }
        for(Card c: cards){
            System.out.println(c);
        }
    }


}
