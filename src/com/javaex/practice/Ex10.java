package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int j = 0;
		System.out.println("숫자를 입력하세요.");
		
		for ( int i = 0; i < 5; i++) {
			
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if ( num > j ) {
				j = num;
			}
		}
		System.out.println("최대값은 " + j + "입니다.");
		sc.close();
	}
}
