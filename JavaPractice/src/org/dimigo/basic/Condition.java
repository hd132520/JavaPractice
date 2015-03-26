/********************************************
 *<< 네번째 수행평가>>
 * 내용 : 고속도로 통행료를 계산하여 출력해보기
 * 작성일 :  2015.03.26
 * @author 박수환
 * @
 */
package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		int dis=10, mon=0;
		
		int pmon;
		String car = "고속버스";
		
		if(car == "고속버스") {
			pmon = 300;
			
		}
		else {
			pmon= 200;
		}
		
		
		
		
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		
		if(car == "고속버스") {
			mon = 850+((dis-1)/10)*pmon;
			
		}
		else if(car == "경차") {
			mon = 300+((dis-1)/10)*pmon;
		}
		else if (car == "그 외") {
			mon = 600+((dis-1)/10)*pmon;
		}
		System.out.println("거리 : " + dis + "km");
		System.out.println("차종 :" + car);
		System.out.println("통행료 : " + mon + "원");

	}

}
