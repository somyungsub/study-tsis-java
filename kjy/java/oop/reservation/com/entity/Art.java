package movie.com.entity;

public class Art {
	private int price;
	private int reservationNum;
	public Art(int price, int reservation){
		this.price = price;
		this.reservationNum = reservation;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getReservationNum() {
		return reservationNum;
	}
	public void setReservationNum(int reservationNum) {
		this.reservationNum = reservationNum;
	}
	
	
}
