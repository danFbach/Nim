package nim;
import java.util.*;

public class GameStart {
	
	Integer StartingPlayer;
	Scanner learn = new Scanner(System.in);
	
	public int menu(){
		System.out.println("Who will start?\n1. Player 1 or 2. Player 2");
		StartingPlayer = learn.nextInt();
		System.out.println("Player " + StartingPlayer + " will start.\n");
		return StartingPlayer;
	}
	public void descript(){
		System.out.println("Starting with 17 items, you may remove 1, 2 or 3 items at a time.");
	}
}
