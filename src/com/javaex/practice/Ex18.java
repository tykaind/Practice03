package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		
		int t_num = num;
		
		for(int i = 0; i<=num; i++) {
			for(int j=1; j<=t_num; j++) {
				System.out.print("*");
				if(j==t_num) {
					System.out.println();
				}
			}
			t_num--;
		}
		for(int ii=2; ii<=num; ii++) {
			for(int jj= 0; jj<ii; jj++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		sc.close();
	}
}
