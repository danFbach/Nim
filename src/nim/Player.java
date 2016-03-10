package nim;

public class Player 
{
	Integer pile = 17;
	Integer P1pick;
	Integer end = 0;
	Integer play;
	Integer removedNum;
	Integer remainingPile;
	Integer AIturn;
	GameEngine stickCount = new GameEngine();
	
	
	public int player1()
	{
		System.out.println("P1 turn");
		AIturn = stickCount.SubtractChoice(pile);
		pile = stickCount.MathEngine(pile);
		if(pile == 1){System.out.println("Player 1 Wins!");
		end = 1;
		}
		return end;
	}
	public int player2()
	{
		System.out.println("P2 turn");
		stickCount.SubtractChoice(pile);
		pile = stickCount.MathEngine(pile);
		if(pile == 1){System.out.println("Player 2 Wins.");
		end = 1;
		}
		return end;
	}
	public int EngineAI(){
		if(AIturn == 1){
			pile -= 3;
			System.out.println("Computer removes 3, " + pile + " remain.");
		}else if(AIturn == 2){
			pile -= 2;
			System.out.println("Computer removes 2, " + pile + " remain.");
		}else if(AIturn == 3){
			pile -= 1;
			System.out.println("Computer removes 1, " + pile + " remain.");
		}
		if(pile == 1){
			System.out.println("COMPUTER WINS!");
			end = 1;
		}
		return end;
	}
}
//	public int playerAI(){
//		removedNum = stickCount.SubtractChoice();
//		remainingPile = stickCount.MathEngine();
//		
//		if(removedNum == 1){
//			stickCount.SubtractChoice();
//		}else if(removedNum == 2){
//			stickCount.SubtractChoice();
//		}else if(removedNum == 3){
//			stickCount.SubtractChoice();
//		}if(remainingPile == 1){System.out.println("Player 1 Loses.");
//		end = 1;
//		}
//		return end;
//	}


