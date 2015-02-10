package backend;

public class flightboard {
	
		private int[][] board = new int[10][10];
		private int flight_num = 0;
		
		
		
		
		public boolean draw_flight(int x, int y, int direction){
			if( x<0 || x > 9 || y < 0 || y > 9 || direction < 1 || direction > 4) return false;
			else{
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
		}
			
			return true;
	}
	
		public void remove_flight( int mark){
			for( int i = 0;i<10;i++){
				for(int j = 0;j < 10;j++){
					if( board[i][j] == mark || board[i][j] == 10 * mark) board[i][j] = 0;
				}
			}
			flight_num--; 
		}
		
		public int location_info(int x, int y){
			return board[x][y];
		}
		
		public void remove_one_part(int x, int y){
			board[x][y] = 0;
		}
		
		
		public int get_flight_num(){
			return flight_num;
		}
		
}
		

