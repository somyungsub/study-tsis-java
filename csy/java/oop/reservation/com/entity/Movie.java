package com.entity;

public class Movie extends Art{
	//Art 클래스는 기본 생성자를 갖고있지 않기 때문에
	//기본생성자를 갖지않은 클래스를 상속받을 때는 
	//super 클래스의 생성자를 호출해야한다.
	
	
	//3.가격을 저장하는 상수값을 설정한다.
	public static int Price = 50;	
	
	//2.Art클래스를 상속받고, 예매수를 저장 가능한 생성자를 추가한다
	// - 생성자에서는 상위 클래스의 생성자를 호출한다.
	public Movie(int reservationNum) {
		super(Price, reservationNum);
	}

	//toString() 메소드를 오버라이딩하여 예매이름과 예매수를 리턴한다 
	//??이건 오버라이딩이 아니라 오버로딩 아닌지?
	@Override
	public String toString() {
		return  "영화 (가격 : " + Price + "), " + super.getReservationNum() + "예매를 장 합니다.";
	}

	/**
	 * 오버라이딩 : 같은 이름의 메소드를 매개변수를 달리하여 사용하는것(다형성 종류)
	 * 오버로딩 : 상위클래스가 가진 메소드를 하위클래스에서 재정의하여 사용(다형성 종류)
	 */
	

	
}
