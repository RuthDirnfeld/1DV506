package rd222dv_assign3;

import java.util.ArrayList;
import java.util.Random;
import rd222dv_assign3.Card.Rank;
import rd222dv_assign3.Card.Suite;
import java.util.Collections;

public class Deck { // in case of plagiarism: I published my whole code on
					// Stackoverflow because I had questions

	ArrayList<Card> deck = new ArrayList<Card>();
	Random rand = new Random();
	
	public Deck() { // an unshuffled deck of cards
		for (Suite suite : Suite.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(suite, rank));
			}
		}
	}

	public void print() {
		for (Card card : deck)
			System.out.println(card); // print all cards
	}

	public void Shuffle() {
		Collections.shuffle(deck);

	}

	public Card dealCard() { //I assume we should deal only one card as it says deal A card in the assignment

		int index = rand.nextInt(deck.size());
		Card cards = deck.get(index);
		return cards;

	}
}
