package CreepGame;


public class Card {

	String name;
	String type;
	
	//constructor of card class 
	public Card(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	//these will grab the names and types of the cards played/stored.
	String getName(){
		return this.name;
	}
	String getType(){
		return this.type;
	}
	
	//compares types of both cards tells if they won, tied, or lost.
		BattleOutcome fights(Card opposingCard){
			//takes the current type and checks to see if the opponent has the same card. if so, tie.
			if(this.type == opposingCard.getType()){
				return BattleOutcome.tie;
				
			} else if(this.type == Library.Monster && opposingCard.type == Library.Possessed){
				return BattleOutcome.win;
				//Player.playCard(Combat.playerCard);
				//ditto for the next 2.
			} else if(this.type == Library.Possessed && opposingCard.type == Library.Serial){
				return BattleOutcome.win;
				
			} else if(this.type == Library.Serial && opposingCard.type == Library.Monster){
				return BattleOutcome.win;
				
			} else {
				//if none matchup, then it's a loss. 
				return BattleOutcome.loss;
			}
		}
}