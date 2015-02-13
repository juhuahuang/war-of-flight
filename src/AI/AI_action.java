package AI;
import java.util.Random;

import backend.action;
public class AI_action extends action {
	
	public int[] take_attack_position(){
		Random rng = new Random();
		int[] position = new int[2]; 
		int x = rng.nextInt(9);
		int y = rng.nextInt(9);
		position[0] = x;
		position[1] = y;
		return position;
	}
}
