package movie;

import movie.com.biz.ReservationBiz;
import movie.com.entity.Drama;
import movie.com.entity.Movie;
import movie.com.entity.Musical;

public class ReservationTest {
	public static void main(String[] args){
		ReservationBiz rb = new ReservationBiz(1000);
		
		rb.addReservation(new Movie(2));
		rb.addReservation(new Drama(2));
		rb.addReservation(new Musical(2));
		rb.addReservation(new Drama(4));
		rb.addReservation(new Movie(2));
		
		rb.printReservation();
		
	}

}
