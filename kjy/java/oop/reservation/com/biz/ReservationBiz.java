package movie.com.biz;

import movie.com.entity.Art;

public class ReservationBiz implements IReservationBiz{
	private int money;
	private Art[] arr = new Art[3];
	private int count = 0;
	
	public ReservationBiz(int money){
		this.money = money;
	}

	@Override
	public Art addReservation(Art art) {
		if(count == arr.length){
			Art[] arr1 = new Art[count*3];
			for(int i = 0;i<arr.length;i++){
				arr1[i] = arr[i];
			}
			arr = arr1;
		}
		System.out.println("현재 잔액:"+money+" 원");
		System.out.println(art.toString());
		if(money >= art.getPrice()*art.getReservationNum()){
			arr[count] = art;
			count++;
			money -= art.getPrice()*art.getReservationNum();
		}else{
			System.out.println("잔액이 부족하여 뮤지컬 예매 불가능합니다.");
		}
		System.out.println();
		return null;
	}

	@Override
	public void printReservation() {
		int price = 0;
		int movieCnt = 0;
		int musicalCnt = 0;
		int dramaCnt = 0;
		for(int i = 0;i<count;i++){
			if("Movie".equals(arr[i].getClass().getSimpleName())){
				movieCnt += arr[i].getReservationNum();
				price += arr[i].getPrice()*arr[i].getReservationNum();
			}else if("Musical".equals(arr[i].getClass().getSimpleName())){
				musicalCnt += arr[i].getReservationNum();
				price += arr[i].getPrice()*arr[i].getReservationNum();
			}else if("Drama".equals(arr[i].getClass().getSimpleName())){
				dramaCnt += arr[i].getReservationNum();
				price += arr[i].getPrice()*arr[i].getReservationNum();
			}
		}
		System.out.println("====== 예매 목록 ======");
		System.out.println("영화 예매 : "+movieCnt);
		System.out.println("연극 예매 : "+dramaCnt);
		System.out.println("뮤지컬 예매 : "+musicalCnt);
		System.out.println("==========================");
		System.out.println("전체 예매 금액 : "+price+" 원");
		System.out.println("남은 금액 : "+this.money+" 원");
	}
}
