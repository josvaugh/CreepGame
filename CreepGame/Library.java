package CreepGame;

import java.util.ArrayList;

public class Library {
	
	static String Monster;
	static String Possessed;
	static String Serial;
	
	private static ArrayList<Card> Library = new ArrayList<Card>(); //Creates an Array List of the Card Object.
	
	public static void initialize() { //Defines the list of Cards
		
		Library.add(new Card("Werewolf of London", Monster));
		Library.add(new Card("Stay Puft Marshmallow Man", Monster));
		Library.add(new Card("Dracula", Monster));
		Library.add(new Card("Zombie", Monster));
		Library.add(new Card("Dr. Jekyll and Mr. Hyde", Monster));
		Library.add(new Card("Pennywise the Clown", Monster));
		Library.add(new Card("Alien", Monster));
		Library.add(new Card("Predator", Monster));
		Library.add(new Card("Frankenstein", Monster));
		Library.add(new Card("Jeepers Creeper", Monster));
		Library.add(new Card("Mister Babadook", Possessed));
		Library.add(new Card("Samara", Possessed));
		Library.add(new Card("Jack Torrance", Possessed));
		Library.add(new Card("Pinhead", Possessed));
		Library.add(new Card("Pyramid Head", Possessed));
		Library.add(new Card("Pazuzu", Possessed));
		Library.add(new Card("Succubus", Possessed));
		Library.add(new Card("Slit-Mouthed Woman", Possessed));
		Library.add(new Card("The Toothfairy", Possessed));
		Library.add(new Card("Slenderman", Possessed));
		Library.add(new Card("Michael Myers", Serial));
		Library.add(new Card("Ghostface", Serial));
		Library.add(new Card("The Devil's Rejects", Serial));
		Library.add(new Card("Jack the Ripper", Serial));
		Library.add(new Card("Hannibal the Cannibal", Serial));
		Library.add(new Card("Freddy Kruegar", Serial));
		Library.add(new Card("Jason Voorhees", Serial));
		Library.add(new Card("Chucky", Serial));
		Library.add(new Card("Jigsaw", Serial));
		Library.add(new Card("Leatherface", Serial));
	}
		
		
	
	public static Card getCardbyID(int id){
		return Library.get(id);
	}//finds the card object in the array and returns its id.
	
	public static int getIDofCard(Card card){
		return Library.indexOf(card);
	}
	//used for many functions that has to know the size of the Library
	public static int librarySize(){
		return Library.size();
	}
}
