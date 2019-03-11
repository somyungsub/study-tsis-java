package com.cafe;


/**
 * Ŀ�� Ŭ����
 * @author EX0517
 * 
 *
 */
class Coffee {
	
	static int defaultShotCnt = 2; //Ŀ�ǿ� ���� �⺻ ��
	int water = 200;
	int milk = 200;
	String cup = "mug"; //default
	static Coffee coffee;
	String menu;
	

	public Coffee() {
		//������
	}

	/**
	 * �Ƹ޸�ī�� ����� �޼ҵ�
	 * @param shotCnt
	 * @return ������� Ŀ�� ����
	 */
	public Coffee makeAmericano(int shotCnt, String temp, String toGo, String iceOrHot) {
		
		return coffee;
		
		//����ó�� 
		//�߰ſ� �µ��� ice�� �ֹ��ϰų� or ������µ��� hot���� �ֹ��� ��� ����ó��
		//�մԿ��� �ٽ� �����
	}

	/**
	 * �Ƹ޸�ī�� ����� �޼ҵ�
	 * @param Order
	 * @return ������� Ŀ�� ����
	 */
	public Coffee makeAmericano(Order order) {
		//?? �̰� Ŭ������ ������� ��ü�ΰ�
		//VO �ΰ�..
		coffee = new Coffee();
		
		//����Ʈ �ӱ�
		coffee.setMilk(0);
		coffee.setDefaultShotCnt(order.getShotCnt() == 2 ? this.defaultShotCnt : order.getShotCnt());
		coffee.setWater(coffee.getWater() * 2);
		coffee.setMenu(order.getMenu());

		//??����ó�� 
		//�߰ſ� �µ��� ice�� �ֹ��ϰų� or ������µ��� hot���� �ֹ��� ��� ����ó��
		//�մԿ��� �ٽ� �����
		if("�̰߰�".equals(order.getTemp())&& "ice".equals(order.getHotOrIce())) {
			
		}
		
		return coffee;
		
	}
	
	/**
	 * �� ����� �޼ҵ�
	 * @param shotCnt
	 * @return ������� Ŀ�� ����
	 */
	public Coffee makeLatte(int shotCnt, String iceOrHot) {
		
		return coffee;
	}
	

	
	/**
	 * �� ����� �޼ҵ�
	 * @param Order
	 * @return ������� Ŀ�� ����
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

