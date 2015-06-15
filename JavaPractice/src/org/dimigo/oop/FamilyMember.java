/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *
 * JavaPractice
 * org.dimigo.oop
 *  |_ FamilyMember
 *
 * 1.  개요 :
 * 2. 작성일: 2015. 6. 12.
 *
 *
 * </pre>
 * @author   : 박수환
 * @version  : 1.0
 */
public class FamilyMember {

		private static int memberCnt;
		private String memberName;
		
		public FamilyMember(String memberName) {
			this.memberName = memberName;
			memberCnt++;
		}
		
		
	
	/**
		 * @return the memberName
		 */
		public String getMemberName() {
			return memberName;
		}
		
		public static void printMemberCnt() {
			System.out.println("가족 총 인원 수 :" + memberCnt+ "명");
		}



	public static void main(String[] args) {
		
		
			
		

	}

}
