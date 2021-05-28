package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int j = sc.nextInt();
		
		for(int i = 1; i<=j; i++) {
			num += i;
			System.out.print(i);
			
			for(int t = i; t<j;) {
			System.out.print("+");
			break;
			}
		}
		System.out.println();
		System.out.println("합계: "+num);
		sc.close();
	}
}
