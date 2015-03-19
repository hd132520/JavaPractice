package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		int mp = 1700000;
		int people = 3;
		int store =1500;
		
		
		System.out.println("<<디매베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+ String.format("%,d", mp)+"원");
		System.out.println("점포 내 직원 수 : "+ people +"명");
		System.out.println("점포 수 : "+ String.format("%,d", store)+"개");
		System.out.println();
		System.out.println();
		System.out.println("연간 인건비 : " +String.format("%,d원", (long)mp*people*store *12));
		

	}

}
