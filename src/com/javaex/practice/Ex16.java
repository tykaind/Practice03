package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int i = sc.nextInt();
		
		for(int j = 1; j<=i; j++) {
			if((j%5)==0) {
				num++;
				sum += j;
			}
		}
		System.out.println("5의 배수의 개수 : " +num);
		System.out.println("5의 배수의 합 : " +sum);
		sc.close();
	}
}