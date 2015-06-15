/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *
 * JavaPractice
 * org.dimigo.oop
 *  |_ PiggyBankTest
 *
 * 1.  개요 :
 * 2. 작성일: 2015. 6. 12.
 *
 *
 * </pre>
 * @author   : 박수환
 * @version  : 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FamilyMember ma = new FamilyMember("엄마 ");
		FamilyMember fa = new FamilyMember("아빠 ");
		FamilyMember me = new FamilyMember("나 ");
		FamilyMember br = new FamilyMember("남동생 ");
		
		FamilyMember.printMemberCnt();
		System.out.println();
		PiggyBank.putMoney(fa,10000);
		System.out.println();
		PiggyBank.putMoney(ma,5000);
		System.out.println();
		PiggyBank.putMoney(me,2000);
		System.out.println();
		PiggyBank.putMoney(br,1000);
		System.out.println();
		PiggyBank.printBalance();
		System.out.println();
		PiggyBank.putMoney(me,1000);
		System.out.println();
		PiggyBank.printBalance();
		
		
		
		
		

	}

}
