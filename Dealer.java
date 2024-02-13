package blackjack.java.jp.ac.uryukyu.ie.e225714;

import java.util.ArrayList;
import java.util.Collections;


public class Dealer extends Human {

    CardDeck deck = new CardDeck();

    protected ArrayList <Integer> cards = new ArrayList<Integer>();

    public Dealer() {
    	for(int n=1; n<=4; n++) {
            for(int i=1; i<=13; i++) {
                cards.add(i);
        }
        }
        Collections.shuffle(cards);
    }

    public ArrayList<Integer> deal(){
        ArrayList<Integer> setCards = new ArrayList<Integer>();
        setCards.add(cards.get(0));
        setCards.add(cards.get(1));
        cards.remove(0);
        cards.remove(0);
        return setCards;
    }

    public void setCards(ArrayList<Integer> drawCard) {
        for(int i= 0; i<drawCard.size(); i++){
        	myCards.add(drawCard.get(i));
        }
    }
    
    public int open() {
        int total = 0;
            for(int i=0; i<=myCards.size(); i++) {
                if(0<= myCards.get(i)) {
                    total += 10;
                }else {
                total += myCards.get(i);
            }
            }
         return total;
    }

    public ArrayList<Integer> hit(){
        ArrayList<Integer>setCards = new ArrayList<Integer>();
        setCards.add(cards.get(0));
        cards.remove(0);
        return cards;
    }
    public boolean checkSum() {
        if (open() < 17 ) {
            return true;
        }else{
            return false;
        }
    }
}