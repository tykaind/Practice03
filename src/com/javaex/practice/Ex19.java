package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
//		System.out.println("---------------------------------");
//		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//		System.out.println("---------------------------------");
//		System.out.print("선택>");
		int num;
		int passbook = 0;
		
		
		for(int t=0; t==0;) {
			
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			num = sc.nextInt();
			
		switch(num) {
		case 1:
			System.out.print("예금액>");
			passbook += sc.nextInt();
			break;
		case 2:
			System.out.print("출금액>");
			passbook -= sc.nextInt();
			break;
		case 3:
			System.out.print("잔고액>");
			System.out.println(passbook);
			break;
		default :
			System.out.println("다시입력해주세요");
			break;
		case 4:
			System.out.print("프로그램 종료");
			t = 1;
		}
		continue;
	}
		sc.close();
	}
}
