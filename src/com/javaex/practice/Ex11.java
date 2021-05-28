package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		int t_num = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		if((num%2)==0) {
			for(int i = 0; i<=num; i+=2) {
			t_num += i;
			}
		}else {
			for(int j = 1; j<=num; j+=2) {
			t_num+=j;
			}
		}
			System.out.println("결과값: "+t_num);
			sc.close();
	}
}
