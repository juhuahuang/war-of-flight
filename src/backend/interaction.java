package backend;

import java.util.Scanner;

public class interaction {
	private Scanner inputReader = new Scanner(System.in);
	
	public int[] take_attack_position(){
		int[] position = new int[2]; 
		int x = inputReader.nextInt();
		int y = inputReader.nextInt();
		position[0] = x;
		position[1] = y;
		return position;
	}
	
	public int[] take_flight_info(){
		int[] info = new int[3];
		int x = inputReader.nextInt();
		int y = inputReader.nextInt();
		int direction = inputReader.nextInt();
		info[0] = x;
		info[1] = y;
		info[2] = direction;
		return info;
		
	}
}
