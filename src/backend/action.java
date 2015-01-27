package backend;

public class action {
	public flightboard attack(flightboard fb, int x, int y){
		if( fb.location_info(x,y)  == 0) return fb;
		else if ( fb.location_info(x, y) == 1 || fb.location_info(x, y) == 2 || fb.location_info(x, y) == 3)
			fb.remove_one_part(x,y);
		else fb.remove_flight(fb.location_info(x, y)/10);
		return fb;
	}
	
	
}
							