package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		int dis=123, mon=0;
		
		String car = "고속버스";
		
		
		
		
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		
		if(car == "고속버스") {
			mon = 850+((dis-1)/10)*300;
			
		}
		else if(car == "경차") {
			mon = 300+((dis-1)/10)*200;
		}
		else if (car == "그 외") {
			mon = 600+((dis-1)/10)*200;
		}
		System.out.println("거리 : " + dis + "km");
		System.out.println("차종 :" + car);
		System.out.println("통행료 : " + mon + "원");

	}

}
