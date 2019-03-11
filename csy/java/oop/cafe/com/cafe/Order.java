package com.cafe;

import java.util.Scanner;

class Order {
	int orderCnt;
	int shotCnt;
	String menu;
	String temp;
	String hotOrIce;
	
	
	
	public final int getShotCnt() {
		return shotCnt;
	}
	public final void setShotCnt(int shotCnt) {
		this.shotCnt = shotCnt;
	}
	
	public final int getOrderCnt() {
		return orderCnt;
	}
	public final void setOrderCnt(int orderCnt) {
		this.orderCnt = orderCnt;
	}
	
	public final String getMenu() {
		return menu;
	}
	public final void setMenu(String menu) {
		this.menu = menu;
	}
	
	public final String getTemp() {
		return temp;
	}
	public final void setTemp(String temp) {
		this.temp = temp;
	}
	
	public final String getHotOrIce() {
		return hotOrIce;
	}
	public final void setHotOrIce(String hotOrIce) {
		this.hotOrIce = hotOrIce;
	}
	
	public Order getOrder() {
		Order order = new Order();
		//고객에게 주문을 받는다
		Scanner sc = new Scanner(System.in);
		System.out.println("주문해주세요.");
		System.out.println("몇잔?");
		order.setOrderCnt(sc.nextInt()); 
		//??자꾸 질문이 바로 출력 되어버림 왜 중간에 넣어야 하는지?
		sc.nextLine();
		System.out.println("차갑게?뜨겁게?");
		order.setTemp(sc.nextLine()); 
		System.out.println("샷은 몇개? 기본은 2샷 입니다.");
		order.setTemp(sc.nextLine()); 
		System.out.println("hot?ice?");
		order.setHotOrIce(sc.nextLine()); 
		System.out.println("숫자를 입력해주세요.");
		System.out.println("1: americano");
		System.out.println("2: latte");
		System.out.println("3: chocolate");
		System.out.println("4: Einspanner");
		order.setMenu(sc.nextLine()); 
		return order;
	}
	
}
