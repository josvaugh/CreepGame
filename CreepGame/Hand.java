package CreepGame;

import java.util.ArrayList;

//this class displays the cards they can play.
public class Hand {
	
	private ArrayList<Card> Hand;
	
	//Hand Class constructor
	public Hand(){
		Hand = new ArrayList<Card>();
	}
	
	//adds a card to your hand
	void addCard(Card card){
		Hand.add(card);
	}
	
	//removes a card from the hand and returns it.
	Card getCard(int n) {
		if(this.size() > n-1){
			return Hand.remove(n-1);
		}
		else {
			return null;
		}	
	}
	//makes the player able to look at the cards
	Card lookAt(int n){
		if(this.size() > n){
			return Hand.get(n);
			}
		else {
			return null;
		}
	}
	//standard size function to work along with other methods.
	int size(){
		return Hand.size();
	}
}
