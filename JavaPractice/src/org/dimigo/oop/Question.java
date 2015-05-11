/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 *<pre>
 *
 * JavaPractice
 * org.dimigo.oop
 *  |_ Question
 *
 * 1.  개요 :
 * 2. 작성일: 2015. 5. 11.
 *
 *
 * </pre>
 * @author   : 박수환
 * @version  : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("정현이의 그녀는?");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		
		if(answer != null && answer.equals("박효경")) {
			System.out.println("정답입니다!");
			
		}
		else {
			System.out.println("정현이에 대해서 모르는구만 다시 공부해");
			
		}
		
		System.out.println("정현이의 휴대폰 기종은?");
		answer = scanner.nextLine();
		
		if(answer != null && answer.equals("G Pro")) {
			System.out.println("정답입니다. 이제 마지막 문제 남았습니다.");
		}
		else {
			System.out.println("틀렸어! 다시공부해!");
			
		}
		System.out.println("정현이의 노트북 회사는?");
		answer = scanner.nextLine();
		
		if(answer != null && answer.equals("삼성")) {
			System.out.println("정답입니다! 끝!");
		}
		else {
			System.out.println("틀렸어! 다시공부해");
		}
		
		
		
	}

}
