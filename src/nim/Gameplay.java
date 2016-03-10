package nim;

public class Gameplay {

	GameStart begin = new GameStart();
	GameEngine play = new GameEngine();
	Player player = new Player();
	Integer StartingPlayer;
	Integer end = 0;
	
	public void playNim(){

		StartingPlayer = begin.menu();
		begin.descript();
		
		
		while(end == 0){
		if(StartingPlayer == 1)
		{
		end = player.player1();
		StartingPlayer = 2;
		}else if(StartingPlayer == 2)
		{
		end = player.player2();
		StartingPlayer = 1;
		}
		}

		
		
	}
	
	 
	
}
