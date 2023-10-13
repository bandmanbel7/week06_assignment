package week_06Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	ArrayList <Card> deck = new ArrayList<>();
	
	public Deck() {
		deck = new ArrayList<Card>();
		
		for (int i=2; i<15; i++) {
			deck.add(new Card(i, "Spades"));
			deck.add(new Card(i, "Hearts"));
			deck.add(new Card(i, "Diamonds"));
			deck.add(new Card(i, "Clubs"));
			
			
			
		}
		
	
		
		
	}
	public void shuffle() {
		
		Collections.shuffle(deck); 
	}
	
	public Card draw() {
		return deck.remove(0);
	}
	

}
