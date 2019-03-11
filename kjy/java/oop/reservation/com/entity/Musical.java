package movie.com.entity;

public class Musical extends Art{
	private static int MUSICAL_PRICE = 200;
	public Musical(int reservationNum){
		super(MUSICAL_PRICE, reservationNum);
	}
	public String toString(){
		return "뮤지컬(가격: "+MUSICAL_PRICE+"원) 애매를"+this.getReservationNum()+" 장 합니다.";
	}
}
