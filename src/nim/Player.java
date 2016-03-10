package nim;

public class Player 
{
	Integer pile;
	Integer P1pick;
	Integer end = 0;
	GameEngine stickCount = new GameEngine();
	
	
	public int player1()
	{
		System.out.println("P1 turn");
		stickCount.SubtractChoice();
		pile = stickCount.MathEngine();
		if(pile == 1){System.out.println("Player 2 Loses.");
		end = 1;
		}
		return end;
	}
	public int player2()
	{
		System.out.println("P2 turn");
		stickCount.SubtractChoice();
		pile = stickCount.MathEngine();
		if(pile == 1){System.out.println("Player 1 Loses.");
		end = 1;
		}
		return end;
	}

}
