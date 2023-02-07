package blackjack.java.jp.ac.uryukyu.ie.e225714;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
	private ArrayList<Card> cards = new ArrayList<Card>();

	public CardDeck() {
		super();
	}
	

	public void createFullDeck() {
		for(int i=0; i<=3; i++) {
			for(int j=1; j<=13; j++) {
				Card c = new Card(i, j);
				cards.add(c);
			}
		}
	}
	

	public void clear() {
		cards.clear();
	}
	

	public void shuffle() {
		Collections.shuffle(cards);
	}
	

	public void addCard(Card card) {
		cards.add(card);
	}
	

	public void addCard(int i, Card card) {
		cards.add(i-1, card);
	}
	

	public Card takeCard() {
		Card c = cards.get(0);
		cards.remove(0);
		c.show();
		return c;
	}
	

	public Card takeCard(int i) {
		Card c = cards.get(i-1);
		cards.remove(i-1);
		c.show();
		return c;
	}
	

	public Card seeCard(int i) {
		Card c = cards.get(i-1);
		System.out.println(i + "番目のカード：" + c.getString(c.getSuit(), c.getNumber()));
		return c;
	}
	

	public int searchCard(int suit, int number) {
		Card c = new Card(suit, number);
		return cards.indexOf(c) + 1;
	}
	

	public boolean isEmpty() {
		return cards.isEmpty();
	}
	

	public int size() {
		return cards.size();
	}
	

	public void showAllCard() {
		System.out.println("------------現在の山を表示します．-----------");
		for(int i=1; i<=size(); i++) {
			seeCard(i);
		}
		System.out.println("------------ここまで-----------");
	}
	

	public List<Card> getAllCards() {
		return cards;
	}
}