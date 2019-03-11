package movie.com.entity;

public class Movie extends Art{
	private static int MOVIE_PRICE = 50;
	public Movie(int reservationNum){
		super(MOVIE_PRICE, reservationNum);
	}
	public String toString(){
		return "영화(가격: "+MOVIE_PRICE+"원) 애매를"+this.getReservationNum()+" 장 합니다.";
	}

}
