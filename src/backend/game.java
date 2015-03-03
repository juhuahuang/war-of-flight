package backend;


public class game {
	private Player player1 ;
	private Player player2 ;
	private interaction game_interaction = new interaction();
	
	private void initialize_gameboard(){
		System.out.println("Player 1 draw flights:");
		int[] info = new int[3];
		while( player1.player_board.get_flight_num() != 3){
			System.out.println("flights:" + (player1.player_board.get_flight_num() +1) );
			System.out.println( "position(x,y):");
		info = game_interaction.take_flight_info();
			player1.player_board.draw_flight(info[0],info[1],info[2]);
			
		}
		System.out.println("Player 2 draw flights:");
		while( player2.player_board.get_flight_num() != 3){
			System.out.println("flights:" + (player2.player_board.get_flight_num() +1 ));
			System.out.println( "position(x,y):");
			info = game_interaction.take_flight_info();
			player2.player_board.draw_flight(info[0],info[1],info[2]);
			
		}
		
	}
	
	public void game_procudure(){
		initialize_gameboard();
		int[] position = new int[2];
		 while(player1.player_board.get_flight_num() != 0 && player2.player_board.get_flight_num() != 0){
			 System.out.println( "player1 attact, please input position (x,y):");
			position = game_interaction.take_attack_position();
			 player1.player_action.attack(player2.player_board,position[0],position[1]);
			
			 System.out.println( "player2 attact, please input position (x,y):");
				position = game_interaction.take_attack_position();
				 player2.player_action.attack(player1.player_board,position[0],position[1]);
		 }
		 if( player2.player_board.get_flight_num() == 0 && player1.player_board.get_flight_num() == 0)
			 System.out.println( " Tie!");
		 else if( player1.player_board.get_flight_num() == 0 ) System.out.println(" player2 won!");
		 else System.out.println(" player1 won!");
	}
}
