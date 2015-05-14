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
 *  |_ Score
 *
 * 1.  개요 :
 * 2. 작성일: 2015. 5. 14.
 *
 *
 * </pre>
 * @author   : 박수환
 * @version  : 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.print("국어 점수 입력 => ");
		Scanner scanner = new Scanner(System.in);
		int kor = scanner.nextInt();
		
		System.out.print("수학 점수 입력 => ");
		int mat= scanner.nextInt();
		
		System.out.println("영어 점수 입력 = > ");
		int eng = scanner.nextInt();
		
		StringBuilder sc= new StringBuilder();
		
		sc.append("\n<< 점수 출력 >>\n ");
		sc.append("국어 점수 : ");
		sc.append(kor+"점\n");
		sc.append("수학 점수 : ");
		sc.append(mat + "점\n");
		sc.append("영어 점수 : ");
		sc.append(eng +"점\n");
		sc.append("총점 : ");
		sc.append(kor+mat+eng + "점\n");
		sc.append("평균 : ");
		double sum=(double )(kor+mat+eng)/3;
		sc.append(String.format("%.1f",sum)+ "점\n");
		
		
		System.out.println(sc);
		
		
		
		}

}
