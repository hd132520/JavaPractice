/**
 * 
 */
package org.dimigo.abstractclass;

/**
 *<pre>
 *
 * JavaPractice
 * org.dimigo.inheritance
 *  |_ Galaxy
 *
 * 1.  개요 :
 * 2. 작성일: 2015. 8. 25.
 *
 *
 * </pre>
 * @author   : 박수환
 * @version  : 1.0
 */
public class Galaxy extends SmartPhone {
	
	public Galaxy() {
		
	}
	
	public Galaxy(String model, String company, int price) {
		super(model,company,price);
		
	}
	public void pay() {
		System.out.println("삼성페이로 결제합니다.");
	}
	
	public void useWirelessCharging() {
		System.out.println("무선 충전기능을 이용합니다.");
	}

}
