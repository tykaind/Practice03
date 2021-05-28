package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		int j = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int i = sc.nextInt();
		
		while(i>=j) {
			j++;
		while((i%j)==0) {
			System.out.println(j);
			break;
			}
		}
		sc.close();
	}

}
