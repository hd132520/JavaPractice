/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *
 * JavaPractice
 * org.dimigo.oop
 *  |_ CarTest
 *
 * 1.  개요 :
 * 2. 작성일: 2015. 4. 13.
 *
 *
 * </pre>
 * @author   : 박수환
 * @version  : 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car hd = new Car();
		Car kia = new Car();
		Car ss = new Car();
		
		
		hd.setCompany("현대자동차");
		hd.setModel("제네시스");
		hd.setColor("검정색");
		hd.setMaxSpeed(225);
		hd.setPrice(50000000);
		
		kia.setCompany("기아자동차");
		kia.setModel("K7");
		kia.setColor("흰색");
		kia.setMaxSpeed(246);
		kia.setPrice(40000000);
		
		ss.setCompany("삼성자동차");
		ss.setModel("SM7");
		ss.setColor("회색");
		ss.setMaxSpeed(200);
		ss.setPrice(38000000);
		
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : " + hd.getCompany() );
		System.out.println("모델명 :" + hd.getModel() );
		System.out.println("색상 : " + hd.getColor() );
		System.out.println("최대속도 : " + hd.getMaxSpeed());
		System.out.println("가격 : " + String.format("%,d",hd.getPrice()) );
		System.out.println("");
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : " + kia.getCompany());
		System.out.println("모델명 :" + kia.getModel() );
		System.out.println("색상 : " + kia.getColor() );
		System.out.println("최대속도 : " +kia.getMaxSpeed());
		System.out.println("가격 : " +String.format("%,d", kia.getPrice()) );
		System.out.println("");
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : " + ss.getCompany());
		System.out.println("모델명 :" + ss.getModel() );
		System.out.println("색상 : " + ss. getColor());
		System.out.println("최대속도 : " + ss.getMaxSpeed());
		System.out.println("가격 : " + String.format("%,d", ss.getPrice()));
		System.out.println("");
		
		//Commit!
		
		

	}

}
