package CreepGame;

public class Player {

	Deck playerDeck; //Holds cards of player
	Hand playerHand; //Cards in players hand
	String playerName; //players name (either player or opponent)
	
	
	public Player(String name){
		playerDeck = new Deck();
		playerName = name;
		playerHand = new Hand();
		
	}
	Deck getDeck(){
		return playerDeck;
	}
	
	Hand getHand(){
		return playerHand;
		
	}
	
	public void drawCard(){
		Card drawnCard = playerDeck.draw();
		if(drawnCard !=null){
			playerHand.addCard(drawnCard);
		}
	}
	//makes the user be able to pick a card in their hand
	public Card playCard(){ 
		return Library.getCardbyID(0);
	}
	
}
