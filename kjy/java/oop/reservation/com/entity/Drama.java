package movie.com.entity;

public class Drama extends Art{
	private static int DRAMA_PRICE = 100;
	public Drama(int reservationNum){
		super(DRAMA_PRICE, reservationNum);
	}
	public String toString(){
		return "드라마(가격: "+DRAMA_PRICE+"원) 애매를"+this.getReservationNum()+" 장 합니다.";
	}
}
