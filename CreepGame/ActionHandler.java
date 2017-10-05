package CreepGame;

public class ActionHandler {
	
	static void buttonPressed(int n){
		if(Combat.getGameOver() == false){
			
			//check if player has a card to play before playing it.
			if(Combat.getPlayerInfo().getHand().lookAt(n - 1) != null){
				Combat.fightAIwithCard(n);
			}
		}
		
		//refresh the frame to update the view
		Gui.repaint();
	}


}
