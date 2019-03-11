package com.biz;

import com.entity.Art;
import com.entity.Movie;

public class ReservationBiz implements IReservationBiz{
	//IReservationBiz를 상속받는 클래스
	//예매 로직을 구현하고 예매정보를 출력하는 클래스
	
	
	//2.클래스 다이어그램을 참조하여 멤버변수 정의
	/**
	 * 클래스 다이어그램 _ 클래스 표기법
	 * 변수
	 * + : public
	 * - : private
	 * 밑줄 : static
	 */
	
	private int money;
	private Art[] art = new Art[3];
	private int count = 0;
	
	
	/**
	 * 생성자
	 */	
	//3. 초기값 금액을 설정하기위한 생정자를 작성한다
	public ReservationBiz(int money) {
		this.money = money;
	}

	/**
	 * 오버라이딩 : 같은 이름의 메소드를 매개변수를 달리하여 사용하는것(다형성 종류)
	 * 오버로딩 : 상위클래스가 가진 메소드를 하위클래스에서 재정의하여 사용(다형성 종류)
	 */
	
	@Override
	public void addReservation(Art art) {
		//1. 현재 잔액을 출력한다.
		System.out.println("현재금액 : " + this.money);
		
		//2.매개변수로 넘겨받은 Art타입에 대한 메시지를 출력한다.
		//메시지 출력시 Art차입의 toString()사용한다.
		System.out.println(art.toString());
		
		//3.잔액과 예매가격을 비교하여 부족한 경우에 에러메시지를 출력한다.
		if(this.money < art.getPrice()) {
			System.out.println("잔액이 부족하여 예매를 취소합니다.");
		}
		//4.현재 갖고있는 잔액에서 예매 가격만큼 뺀다
		this.money = this.money - art.getPrice();
		
		//5. 배열에 저장된 개수와 배열의 크기가 같으면, 기존의 배열보다 사이즈가 3배인 배열을 생성한 후, 기존의 배열 내용을 새로운 배열에 복사하고 새로운 배열과 기존 배열을 바꾼다
		
		//6. 배열에 예매한 개수만큼 저장하고 count 값 증가 시킨다
		
	}

	@Override
	public void printReservation() {
		int totalPrice = 0;
		for(int i=0; i < art.length; i++) {
			//1.배열에 저장된 예매수를 count 한다
			count = art[i].getReservationNum();

			//2.배열에 저장된 총 예매비용을 계산한다
			totalPrice = art[i].getPrice();
		}
		//3. 예매 목록과 남은 잔액을 출력한다
		System.out.println("전체 예매금액 : " + totalPrice + "원");
		System.out.println("남은 잔액: " +(this.money - totalPrice) + "원");
	}	

	
}
