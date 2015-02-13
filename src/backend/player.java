package backend;

import AI.AI_action;
import AI.AI_flightboard;

public class player {
	
	public action player_action;
	public flightboard player_board;
	public player(){
		player_action = new action();
		player_board = new flightboard();
	}
	
	public player(boolean AI_flag){
		if(AI_flag){
			player_action = new AI_action();
			player_board = new AI_flightboard();
		}
		else{
			player_action = new action();
			player_board = new flightboard();	
		}
	}

}
