package CreepGame;

import java.util.ArrayList;
import java.util.Collections;


//this class holds and array for a player called a "Deck"
public class Deck {

	private ArrayList<Card> Deck;
	
	public Deck(){
		Deck = new ArrayList<Card>();
		ConstructDeck();
	}
	
	//creates a randomly generated deck for the player
	public void ConstructDeck(){
		for (int i=0; i< Library.librarySize(); i++){
			Deck.add(Library.getCardbyID(i));
		}
		
		this.shuffle();
			
	}
	
	public Card get(int index){
		return Deck.get(index);
	}
	
	public int size(){
		return Deck.size();
	}
	//Found a neat way to shuffle the deck!
	//Randomly permutes the specified list using a default source of randomness
	public void shuffle(){
		Collections.shuffle(Deck);
	}
	//removes the top card of the deck and returns it.
	public Card draw(){
		if(this.size()>0){
			return Deck.remove(0);
			}
		else {
			return null;
		}	
	}
}
