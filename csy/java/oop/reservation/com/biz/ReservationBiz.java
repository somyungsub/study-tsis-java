package com.biz;

import com.entity.Art;
import com.entity.Movie;

public class ReservationBiz implements IReservationBiz{
	//IReservationBiz�� ��ӹ޴� Ŭ����
	//���� ������ �����ϰ� ���������� ����ϴ� Ŭ����
	
	
	//2.Ŭ���� ���̾�׷��� �����Ͽ� ������� ����
	/**
	 * Ŭ���� ���̾�׷� _ Ŭ���� ǥ���
	 * ����
	 * + : public
	 * - : private
	 * ���� : static
	 */
	
	private int money;
	private Art[] art = new Art[3];
	private int count = 0;
	
	
	/**
	 * ������
	 */	
	//3. �ʱⰪ �ݾ��� �����ϱ����� �����ڸ� �ۼ��Ѵ�
	public ReservationBiz(int money) {
		this.money = money;
	}

	/**
	 * �������̵� : ���� �̸��� �޼ҵ带 �Ű������� �޸��Ͽ� ����ϴ°�(������ ����)
	 * �����ε� : ����Ŭ������ ���� �޼ҵ带 ����Ŭ�������� �������Ͽ� ���(������ ����)
	 */
	
	@Override
	public void addReservation(Art art) {
		//1. ���� �ܾ��� ����Ѵ�.
		System.out.println("����ݾ� : " + this.money);
		
		//2.�Ű������� �Ѱܹ��� ArtŸ�Կ� ���� �޽����� ����Ѵ�.
		//�޽��� ��½� Art������ toString()����Ѵ�.
		System.out.println(art.toString());
		
		//3.�ܾװ� ���Ű����� ���Ͽ� ������ ��쿡 �����޽����� ����Ѵ�.
		if(this.money < art.getPrice()) {
			System.out.println("�ܾ��� �����Ͽ� ���Ÿ� ����մϴ�.");
		}
		//4.���� �����ִ� �ܾ׿��� ���� ���ݸ�ŭ ����
		this.money = this.money - art.getPrice();
		
		//5. �迭�� ����� ������ �迭�� ũ�Ⱑ ������, ������ �迭���� ����� 3���� �迭�� ������ ��, ������ �迭 ������ ���ο� �迭�� �����ϰ� ���ο� �迭�� ���� �迭�� �ٲ۴�
		
		//6. �迭�� ������ ������ŭ �����ϰ� count �� ���� ��Ų��
		
	}

	@Override
	public void printReservation() {
		int totalPrice = 0;
		for(int i=0; i < art.length; i++) {
			//1.�迭�� ����� ���ż��� count �Ѵ�
			count = art[i].getReservationNum();

			//2.�迭�� ����� �� ���ź���� ����Ѵ�
			totalPrice = art[i].getPrice();
		}
		//3. ���� ��ϰ� ���� �ܾ��� ����Ѵ�
		System.out.println("��ü ���űݾ� : " + totalPrice + "��");
		System.out.println("���� �ܾ�: " +(this.money - totalPrice) + "��");
	}	

	
}
