package nim;

public class Gameplay {

	GameStart begin = new GameStart();
	GameEngine stickCount = new GameEngine();
	Player player = new Player();
	Integer StartingPlayer;
	Integer GameType;
	Integer end = 0;
	
	public void playNim(){
		
		GameType = begin.menu1();
		if(GameType == 1){
		StartingPlayer = begin.menu2();		
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
		}else if(GameType == 2)
		{
			while(end == 0)
			{
				end = player.player1();
				end = player.EngineAI();
		}
		}else if(GameType == 3)	
		{
			while(end == 0)
			{
				end = player.player1();
				end = player.EasyEngineAI();
			}		
		}		
	}	
}
