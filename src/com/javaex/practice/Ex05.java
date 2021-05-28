package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		//1부터5까지 세로로출력되고 i가6으로 증감되었을때 
		//flag값이 펄스로 바꿔주어 반복문을 빠져나가게한다.
		int i =1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			System.out.println(i);
			i=i+1;
		}

	}

}
