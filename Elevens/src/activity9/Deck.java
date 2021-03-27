package activity9;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");

	
	private List<Card> cards;
	//private Card[] cards;
	private int size;


	public Deck(String[] ranks, String[] suits, int[] values) 
	{
		cards = new ArrayList<Card>();
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				cards.add(new Card(ranks[j], suits[i], values[j]));
			}
			size = cards.size();
		}
		/*cards = new Card[ranks.length*suits.length];
		for (int i = 0; i < ranks.length; i++) 
		{
			for (int j = 0; j < suits.length; j++) 
			{
				int Index = (suits.length)*i + j;
				cards[Index]= new Card(ranks[i], suits[j], values[i]);
			}
			size = cards.length;
			}
		*/
		
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		//return size() == 0;
		return size() == 0;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		
	

		for (int i= cards.size() - 1; i>0; i--) {

			 int j = i + 1;
			 int index = 0;
			 int random = (int) (Math.random() * j) + index;
			 Card temp = cards.get(i);
			 cards.set(i, cards.get(random));
			 cards.set(random, temp);
		

		}
		size = cards.size();


		/*for (int i= cards.length-1 ; i>0; i--) {

			 int j = i + 1;
			 int index = 0;
			 int random = (int) (Math.random() * j) + index;
			 Card temp = cards[i];
			 cards[j] = cards[random];
			 cards[random]= temp;
			 size = cards.length;
		}
		*/
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {	
    		if(isEmpty()) {
				return null;
    		}
			size--; 
			Card temp = cards.get(size);
			//Card temp = cards[size];
			return temp; 
	}
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			//rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
		//for (int k = cards.length - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			//rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
			//if ((k - cards.length) % 2 == 0) 
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
