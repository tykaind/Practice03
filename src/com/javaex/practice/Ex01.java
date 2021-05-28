package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("while문");
		int index = 0;
		while(index < 3) {
			System.out.println("index=" + index);
			index++;
		}
		//둘다 출력문에 0,1,2를 각각 출력한다.
		System.out.println("for문");
		for(int order=0; order<3; order++) {
				System.out.println("order="+order);

		}
	}
}
