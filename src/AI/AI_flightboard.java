package AI;
import backend.flightboard;
import java.util.Random;
public class AI_flightboard extends flightboard {
	public boolean draw_flight(){
		Random rng = new Random();
		int x = rng.nextInt(9);
		int y = rng.nextInt(9);
		int direction = rng.nextInt(3);
		
		int flight_mark = flight_num+1;
		flight_num++;
		if( direction == 1){ //flight head up
			if( x+3>9 || y-2<0  || y+2>9) return false;
			if( board[x][y] == 0) board[x][y] = flight_mark *10;
			else return false;
			for(int i = y - 2;i<= y+2;i++){
				if( board[x+1][i] == 0) board[x+1][i] = flight_mark;
				else{
					remove_flight(flight_mark);
					return false;
				}
			}
			
			
			if(board[x+2][y] == 0) board[x+2][y] = flight_mark;
			else{
				remove_flight(flight_mark);
				return false;
			}
			
			for(int i = y - 1;i<= y+1;i++){
				if( board[x+3][i] == 0) board[x+3][i] = flight_mark;
				else{
					remove_flight(flight_mark);
					return false;
				}
			}	
		}
		
		else if( direction == 2){ //flight head right
			if( y-3<0 || x-2<0  || x+2>9) return false;
			if( board[x][y] == 0) board[x][y] = flight_mark *10;
			else return false;
			for(int i = x - 2;i<= x+2;i++){
				if( board[i][y-1] == 0) board[i][y-1] = flight_mark;
				else{
					remove_flight(flight_mark);
					return false;
				}
			}
			
			
			if(board[x][y-2] == 0) board[x][y-2] = flight_mark;
			else{
				remove_flight(flight_mark);
				return false;
			}
			
			for(int i = x - 1;i<= x+1;i++){
				if( board[i][y-3] == 0) board[i][y-3] = flight_mark;
				else{
					remove_flight(flight_mark);
					return false;
				}
			}	
		}
		
		else if( direction == 3){ //flight head down
			if( x-3<0 || y-2<0  || y+2>9) return false;
			if( board[x][y] == 0) board[x][y] = flight_mark *10;
			else return false;
			for(int i = y - 2;i<= y+2;i++){
				if( board[x-1][i] == 0) board[x-1][i] = flight_mark;
				else{
					remove_flight(flight_mark);
					return false;
				}
			}
			
			
			if(board[x-2][y] == 0) board[x-2][y] = flight_mark;
			else{
				remove_flight(flight_mark);
				return false;
			}
			
			for(int i = y - 1;i<= y+1;i++){
				if( board[x-3][i] == 0) board[x-3][i] = flight_mark;
				else{
					remove_flight(flight_mark);
					return false;
				}
			}	
		}
		
		else if( direction == 4){ //flight head left
			if( y+3>9 || x-2<0  || x+2>9) return false;
			if( board[x][y] == 0) board[x][y] = flight_mark *10;
			else return false;
			for(int i = x - 2;i<= x+2;i++){
				if( board[i][y+1] == 0) board[i][y+1] = flight_mark;
				else{
					remove_flight(flight_mark);
					return false;
				}
			}
			
			
			if(board[x][y+2] == 0) board[x][y+2] = flight_mark;
			else{
				remove_flight(flight_mark);
				return false;
			}
			
			for(int i = x - 1;i<= x+1;i++){
				if( board[i][y+3] == 0) board[i][y+3] = flight_mark;
				else{
					remove_flight(flight_mark);
					return false;
				}
			}	
		}
		
		return true;
}
}
