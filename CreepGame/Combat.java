package CreepGame;

import java.util.Random;

//Both players will be going at the same time, when both pick a card, it'll go play out.
public class Combat {

	private static int turnsTaken=0;
	
	private static boolean PlayersAreAttacking = false;
	private static boolean gameOver;
	private static BattleOutcome playerVictory;
	
	private static Player player;
	private static Player opponent;
	
	private static Card playerCard;
	private static Card opponentCard;
	
	static void initialize(){
		//Starts up the game, declaring the players and drawing them both 3 cards each.
		playerCard = null;
		opponentCard = null;
		
		player = new Player("Player");
		opponent = new AIPlayer("Opponent");
		
		player.drawCard();
		player.drawCard();
		player.drawCard();
		
		opponent.drawCard();
		opponent.drawCard();
		opponent.drawCard();
		
		gameOver=false;
	}
	//outcome of battle
	static BattleOutcome fightAIwithCard(int n){
		
		turnsTaken++;
		BattleOutcome outcome;
		BattleOutcome playerSuccess;
		
		playerCard   = player.getHand().getCard(n);
		opponentCard = opponent.playCard();
		
		player.drawCard();
		opponent.drawCard();
		
		if(PlayersAreAttacking){
			outcome=playerCard.fights(opponentCard);
			
			if(outcome == BattleOutcome.win){
				
			}
						
		}
		
		return null;		
	}
	
	/*----------All of these go to the GUI, AI and ActionHandler---------*/
	public static boolean PlayersAreAttacking(){
			return PlayersAreAttacking;
		}
	public static Boolean getGameOver(){
		return gameOver;
	}
	
	public static Card getPlayerLastPlayed(){
		return playerCard;
	}
	
	public static BattleOutcome getVictory(){
		return playerVictory;
	}
	
	public static Card getOpponentLastPlayed(){
		return opponentCard;
	}
	
	//returns the player object for info about the player.
	public static Player getPlayerInfo(){
		return player;
	}
	//will be used to see how long the game has lasted
	int getTurn(){
		return turnsTaken;
	}
}
