package week_06Assignment;

import java.util.ArrayList;
import java.util.List;

public class Player {

	
	private List <Card> hand =  new ArrayList<Card>();
    private int score;
    private String name;
    
    
    public Player(String name, int score) {
    	this.setName(name);
    	this.setScore(score); 
    }
    
    
    public void setScore(int score) {
    	this.score = score;
    }
    
    public void describe() {
    	
    	System.out.println(this.name + " Score: " + this.score );
    }
    
    public void describeName() {
    	
    	System.out.print(this.name + " Card: ");
    }
    
    public void setName(String name) {
    	this.name = name;
    }
     
    public int getScore () {
    	return score;
    }
    
    public String getName() {
    	return name;
    }
    
    
    public void draw (Deck deck) {
    	while(hand.size()<26) {
    		hand.add(deck.draw());
    		
    	}
    	
    	
    	
    }
    public Card flip() {
		return hand.remove(0);
	}
    
    public void incrementScore() {
    	score++;
    }
    
   
    
}

