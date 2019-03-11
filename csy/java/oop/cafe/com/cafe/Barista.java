package com.cafe;

//??자바파일에 1개의 public class가 한개인 이유?
public class Barista {

	public static void main(String[] args) {
		//메인메소드로서 여기서 바리스타가 하는 일이 일어남
		//0. 바리스타가 입사했다.
		Barista barista1 = new Barista();
		
		//1. 주문을 받는다
		Order order = new Order();
		order = order.getOrder();
		
		//2. 커피 주문을 넣어서 주문 갯수를 확인한다	
		Coffee coffee = new Coffee();
		Object[] coffeeTray = new Object[order.getOrderCnt()];
		
		//고객이 주문한 수만큼 커피를 만든다
		for(int i = 0; i < order.getOrderCnt(); i++) {
			if("1".equals(order.getMenu())) {
				coffee = coffee.makeAmericano(order);
			}else if("2".equals(order.getMenu())){
				coffee = coffee.makeLatte(order);
			}else {
				coffee = coffee.makeAmericano(4, "뜨겁게", "togo", "hot");
			}
			coffeeTray[i] = coffee;
		}
		
		//?? 둘의 차이점은?
		//int orderCnt = coffee.makeAmericano(3, "뜨겁게", "toGo", "ice");
		//int orderCnt = coffee.makeAmericano(order);
		
		//3. 고객에게 커피를 건낸다
		barista1.serveCoffeeToCusomer(coffeeTray);		
	}
	
	public void serveCoffeeToCusomer(Object[] coffeeTray) {
		Coffee coffee = new Coffee();
		System.out.println("주문하신 음료 ");
		for(int i = 0; i < coffeeTray.length; i++) {
			coffee = (Coffee)coffeeTray[i];
			System.out.println("1".equals(coffee.getMenu()) ? "아메리카노" : "라떼");
		}
		System.out.println(coffeeTray.length + "잔 나왔습니다.");
	}
	

}
