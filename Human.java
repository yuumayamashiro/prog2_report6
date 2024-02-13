package blackjack.java.jp.ac.uryukyu.ie.e225714;

import java.util.ArrayList;

public abstract class Human {
    
	protected ArrayList<Integer> myCards = new ArrayList<Integer>();

	abstract public int open();

    abstract public void setCards(ArrayList <Integer> drawCard);


    abstract public boolean checkSum();

    }