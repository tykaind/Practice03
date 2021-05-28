package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		int s = 0;
		int ss = 1;
		
		for ( int i = 0; i < 10; i++) {

			for( int j = 0; j < 10; j++) {
				
				s = s +1;
				System.out.print(s + "\t");
			}
			s = ss++;
			System.out.println("");
		}
	}
}
