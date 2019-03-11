package com.test;

import com.biz.ReservationBiz;
import com.entity.Art;
import com.entity.Drama;
import com.entity.Movie;
import com.entity.Musical;

public class ReservationTest {

	public static void main(String args[]) {
		
		//1. ����Ͻ� ������ ó���ϱ� ���Ͽ� ReservationBiz ��ü�� �����Ѵ�
		ReservationBiz rsvBiz = new ReservationBiz(1000);
		
		//2.�ʿ��� ���ż��� ���ڷ� ���� ArtŸ���� ��ü�� �����Ͽ� �����Ѵ�
		Art movie  = new Movie(3);
		rsvBiz.addReservation(movie);
		Art musical  = new Musical(2);
		rsvBiz.addReservation(musical);
		Art drama  = new Drama(1);
		rsvBiz.addReservation(drama);
		
		//3.printReservation()�޼ҵ带 ȣ���Ͽ� ���������� ����Ѵ�.
		rsvBiz.printReservation();
		
	}
	
}
