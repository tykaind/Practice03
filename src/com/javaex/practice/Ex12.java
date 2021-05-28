package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		int num = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int j = sc.nextInt();
		
		for(int i = j; i>=1; i--) {
			num = num*i;
		}
		System.out.println("결과값: "+num);
		sc.close();
	}
}
