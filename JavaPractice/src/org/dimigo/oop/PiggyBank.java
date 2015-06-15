/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *
 * JavaPractice
 * org.dimigo.oop
 *  |_ PiggyBank
 *
 * 1.  개요 :
 * 2. 작성일: 2015. 6. 12.
 *
 *
 * </pre>
 * @author   : 박수환
 * @version  : 1.0
 */
public class PiggyBank {

		private static int balance;
		
		public static void putMoney(FamilyMember member,int amount) {
			balance +=amount;
			System.out.print(member.getMemberName());
			System.out.println(amount+"원 넣음");
		
			
		}
		
		public static void printBalance() {
			System.out.println("돼지저금통 총 금액 : "+balance+"원");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
