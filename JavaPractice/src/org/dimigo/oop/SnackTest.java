/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *
 * JavaPractice
 * org.dimigo.oop
 *  |_ SnackTest
 *
 * 1.  개요 :
 * 2. 작성일: 2015. 5. 18.
 *
 *
 * </pre>
 * @author   : 박수환
 * @version  : 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Snack[] snackArr = new Snack[]{
				new Snack("새우깡","농심",1100,2),
				new Snack("콘칲","크라운",1200,1),
				new Snack("허니버터칩","해태",1500,4)
		};
		
		


		
		for(Snack val: snackArr) {
			val.printSnack();
			System.out.println();
		}System.out.println();
		
	
		
	
		

	}

	/**
	 * 
	 */

}
