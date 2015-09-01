/**
 * 
 */
package org.dimigo.abstractclass;

/**
 *<pre>
 *
 * JavaPractice
 * org.dimigo.inheritance
 *  |_ SmartPhone
 *
 * 1.  개요 :
 * 2. 작성일: 2015. 8. 25.
 *
 *
 * </pre>
 * @author   : 박수환
 * @version  : 1.0
 */
public abstract class SmartPhone {

	private String model;
	private String company;
	private int price;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company=company;
		this.price=price;
		
	}
	
	
	public void turnOn() {
		System.out.println(this.model+"의 전원을 켭니다");
	}
	public void turnOff() {
		System.out.println(this.model+"의 전원을 끕니다.");
	}
	//public void pay() {
	//	System.out.println(this.company+"로 결제합니다.");
	//}
	public abstract void pay();
	public void useSpecialFunction(SmartPhone phone) {
		if(phone instanceof Galaxy) 
				((Galaxy)phone).useWirelessCharging();
		else if(phone instanceof IPhone)
			((IPhone)phone).useAirDrop();
				
		
	}
	
	public String toString() {
		return "모델명 : "+this.model +" 제조사 : " + this.company +" 가격 : "+String.format("%, d",650000) + "원";
	}
	
	
	
}
