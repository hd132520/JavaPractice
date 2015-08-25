/**
 * 
 */
package org.dimigo.inheritance;

/**
 *<pre>
 *
 * JavaPractice
 * org.dimigo.inheritance
 *  |_ SmartPhoneTest
 *
 * 1.  개요 :
 * 2. 작성일: 2015. 8. 25.
 *
 *
 * </pre>
 * @author   : 박수환
 * @version  : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone[] phones = {
				new IPhone("IPhone 6","Apple",700000),
				new Galaxy("갤럭시 S6","삼성",650000)};
				
		for(SmartPhone msi : phones) {
			System.out.println(msi);
			msi.turnOn();
			msi.pay();
			msi.useSpecialFunction(msi);
			msi.turnOff();
			System.out.println();
			
		}
				
		}

	}
