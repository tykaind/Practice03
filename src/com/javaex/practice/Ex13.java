package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int j = sc.nextInt();
		
		for(int i = 1; i<=j; i++) {
			num += i;
		}
		System.out.println("합계: "+num);
		sc.close();

	}

}
