package com.cafe;

//??�ڹ����Ͽ� 1���� public class�� �Ѱ��� ����?
public class Barista {

	public static void main(String[] args) {
		//���θ޼ҵ�μ� ���⼭ �ٸ���Ÿ�� �ϴ� ���� �Ͼ
		//0. �ٸ���Ÿ�� �Ի��ߴ�.
		Barista barista1 = new Barista();
		
		//1. �ֹ��� �޴´�
		Order order = new Order();
		order = order.getOrder();
		
		//2. Ŀ�� �ֹ��� �־ �ֹ� ������ Ȯ���Ѵ�	
		Coffee coffee = new Coffee();
		Object[] coffeeTray = new Object[order.getOrderCnt()];
		
		//���� �ֹ��� ����ŭ Ŀ�Ǹ� �����
		for(int i = 0; i < order.getOrderCnt(); i++) {
			if("1".equals(order.getMenu())) {
				coffee = coffee.makeAmericano(order);
			}else if("2".equals(order.getMenu())){
				coffee = coffee.makeLatte(order);
			}else {
				coffee = coffee.makeAmericano(4, "�̰߰�", "togo", "hot");
			}
			coffeeTray[i] = coffee;
		}
		
		//?? ���� ��������?
		//int orderCnt = coffee.makeAmericano(3, "�̰߰�", "toGo", "ice");
		//int orderCnt = coffee.makeAmericano(order);
		
		//3. ������ Ŀ�Ǹ� �ǳ���
		barista1.serveCoffeeToCusomer(coffeeTray);		
	}
	
	public void serveCoffeeToCusomer(Object[] coffeeTray) {
		Coffee coffee = new Coffee();
		System.out.println("�ֹ��Ͻ� ���� ");
		for(int i = 0; i < coffeeTray.length; i++) {
			coffee = (Coffee)coffeeTray[i];
			System.out.println("1".equals(coffee.getMenu()) ? "�Ƹ޸�ī��" : "��");
		}
		System.out.println(coffeeTray.length + "�� ���Խ��ϴ�.");
	}
	

}
