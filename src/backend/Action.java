package backend;

import java.util.Scanner;

public class Action {
	
	public int[] take_attack_position(){
		Scanner sc = new Scanner(System.in);
		int[] position = new int[2]; 
		int x = sc.nextInt();
		int y = sc.nextInt();
		position[0] = x;
		position[1] = y;
		sc.close();
		return position;
	}
	
	
	public  void attack(FlightBoard fb, int x, int y){
		if( fb.location_info(x,y)  == 0) {
			System.out.println("miss target");
			return;
		}
		else if ( fb.location_info(x, y) == 1 || fb.location_info(x, y) == 2 || fb.location_info(x, y) == 3){
			System.out.println("hit a flight");
			fb.remove_one_part(x,y);
			return;
		}
		else {
			System.out.println("destroy a flight");
			fb.remove_flight(fb.location_info(x, y)/10);
		}
	}
	
	
}
							