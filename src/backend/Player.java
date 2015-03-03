package backend;

import AI.AI_action;
import AI.AI_flightboard;

public class Player {
	
	public Action player_action;
	public FlightBoard player_board;
	public Player() {
		player_action = new Action();
		player_board = new FlightBoard();
	}
	
	public Player(boolean AI_flag){
		if(AI_flag){
			player_action = new AI_action();
			player_board = new AI_flightboard();
		}
		else{
			player_action = new Action();
			player_board = new FlightBoard();	
		}
	}

}
