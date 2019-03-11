package com.cafe;


/**
 * 커피 클래스
 * @author EX0517
 * 
 *
 */
class Coffee {
	
	static int defaultShotCnt = 2; //커피에 들어가는 기본 샷
	int water = 200;
	int milk = 200;
	String cup = "mug"; //default
	static Coffee coffee;
	String menu;
	

	public Coffee() {
		//생성자
	}

	/**
	 * 아메리카노 만드는 메소드
	 * @param shotCnt
	 * @return 만들어진 커피 갯수
	 */
	public Coffee makeAmericano(int shotCnt, String temp, String toGo, String iceOrHot) {
		
		return coffee;
		
		//예외처리 
		//뜨거운 온도와 ice로 주문하거나 or 차가운온도와 hot으로 주문할 경우 예외처리
		//손님에게 다시 물어본다
	}

	/**
	 * 아메리카노 만드는 메소드
	 * @param Order
	 * @return 만들어진 커피 갯수
	 */
	public Coffee makeAmericano(Order order) {
		//?? 이게 클래스로 만들어진 객체인가
		//VO 인가..
		coffee = new Coffee();
		
		//디폴트 머그
		coffee.setMilk(0);
		coffee.setDefaultShotCnt(order.getShotCnt() == 2 ? this.defaultShotCnt : order.getShotCnt());
		coffee.setWater(coffee.getWater() * 2);
		coffee.setMenu(order.getMenu());

		//??예외처리 
		//뜨거운 온도와 ice로 주문하거나 or 차가운온도와 hot으로 주문할 경우 예외처리
		//손님에게 다시 물어본다
		if("뜨겁게".equals(order.getTemp())&& "ice".equals(order.getHotOrIce())) {
			
		}
		
		return coffee;
		
	}
	
	/**
	 * 라떼 만드는 메소드
	 * @param shotCnt
	 * @return 만들어진 커피 갯수
	 */
	public Coffee makeLatte(int shotCnt, String iceOrHot) {
		
		return coffee;
	}
	

	
	/**
	 * 라떼 만드는 메소드
	 * @param Order
	 * @return 만들어진 커피 갯수
	 */
	public Coffee makeLatte(Order order) {
		
		return coffee;
	}

	/**
	 * getter/ setter
	 * @return
	 */
	public final int getDefaultShotCnt() {
		return defaultShotCnt;
	}

	public final void setDefaultShotCnt(int defaultShotCnt) {
		this.defaultShotCnt = defaultShotCnt;
	}

	public final int getWater() {
		return water;
	}

	public final void setWater(int water) {
		this.water = water;
	}

	public final int getMilk() {
		return milk;
	}

	public final void setMilk(int milk) {
		this.milk = milk;
	}

	public final String getCup() {
		return cup;
	}

	public final void setCup(String cup) {
		this.cup = cup;
	}

	public final String getMenu() {
		return menu;
	}

	public final void setMenu(String menu) {
		this.menu = menu;
	}
	
	
	
}

