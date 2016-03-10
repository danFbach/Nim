package nim;
import java.util.Scanner;

public class GameEngine {
	
	Scanner newNum = new Scanner(System.in);
	Integer play = 0;
	Integer pile;
	Integer numToRmv;
	
	public int SubtractChoice(Integer pile){
		System.out.println("There are " + pile + " pieces remaining in the Pile.\n"
				+ "Will you remove 1, 2 or 3 pieces from the pile?\n");
		numToRmv = newNum.nextInt();
		return numToRmv;
	}	
	public int MathEngine(Integer pile){
		pile -= numToRmv;	
		System.out.println(pile + " pieces remain in the pile.");
		return pile;
	}
	
}






