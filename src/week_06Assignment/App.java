package week_06Assignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Deck deck = new Deck();
		System.out.println();
		
		
		deck.shuffle();
		
		Player firstPlayer = new Player("Player1", 0);
		firstPlayer.draw(deck);
		
		Player secondPlayer =  new Player("Player2", 0);
		secondPlayer.draw(deck);
		
		for (int i=2; i<26; i++) {
			Card firstPlayerCard = firstPlayer.flip();
			Card secondPlayerCard = secondPlayer.flip();
			
			System.out.println("----------------------");
			
			
			
		if (firstPlayerCard.getValue()	 >  secondPlayerCard.getValue()) {
			firstPlayer.describeName(); firstPlayerCard.describe();
			secondPlayer.describeName(); secondPlayerCard.describe(); 
			firstPlayer.incrementScore();
			System.out.println("The 1st Player WINS !!!!");
			firstPlayer.describe();
			secondPlayer.describe();
		}
		
		else if (firstPlayerCard.getValue() < secondPlayerCard.getValue()) {
			firstPlayer.describeName(); firstPlayerCard.describe();
			secondPlayer.describeName(); secondPlayerCard.describe(); 
			secondPlayer.incrementScore();
			System.out.println("The 2nd Player WINS !!!!");
			firstPlayer.describe();
			secondPlayer.describe();	
			
		}
		else if (firstPlayerCard.getValue() == secondPlayerCard.getValue() ) {
			firstPlayer.describeName(); firstPlayerCard.describe();
			secondPlayer.describeName(); secondPlayerCard.describe(); 
			System.out.println("DRAW");
			firstPlayer.describe();
			secondPlayer.describe();
		}
		
		
		System.out.println("----------------------");
		
		
		}
		
		if (firstPlayer.getScore() > secondPlayer.getScore()) {
			System.out.println("Player 1 YOU ARE THE WINNER");
		} else if (secondPlayer.getScore() > firstPlayer.getScore()) {
			System.out.println("Player 2 YOU ARE THE WINNER");
		} else {
			System.out.println("The game has resulted in a TIE");
		
		
		}
		
		
		
		
	}

}
