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
		//������ �ֹ��� �޴´�
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹ����ּ���.");
		System.out.println("����?");
		order.setOrderCnt(sc.nextInt()); 
		//??�ڲ� ������ �ٷ� ��� �Ǿ���� �� �߰��� �־�� �ϴ���?
		sc.nextLine();
		System.out.println("������?�̰߰�?");
		order.setTemp(sc.nextLine()); 
		System.out.println("���� �? �⺻�� 2�� �Դϴ�.");
		order.setTemp(sc.nextLine()); 
		System.out.println("hot?ice?");
		order.setHotOrIce(sc.nextLine()); 
		System.out.println("���ڸ� �Է����ּ���.");
		System.out.println("1: americano");
		System.out.println("2: latte");
		System.out.println("3: chocolate");
		System.out.println("4: Einspanner");
		order.setMenu(sc.nextLine()); 
		return order;
	}
	
}
