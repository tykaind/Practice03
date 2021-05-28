package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int random = 40;
        int i=0;
        
        System.out.println("===========================");
        System.out.println("   [숫자맞추기게임 시작]");
        System.out.println("===========================");
        
        
        while(true) {
            System.out.print(">>");
            i = sc.nextInt();
            if(i>random) {
            System.out.println("더 높게");
            continue;
        }else {
        	if(i<random) {
                System.out.println("더 낮게");
                continue;
        	}else {
        		if(i==random) {
                    System.out.println("맞았습니다.");
                    System.out.print("게임을 종료하시겠습니까> (y/n) >>");
                    String end = sc.next();
                    
                    if(end.equals("n")) {
                        System.out.println("===========================");
                        System.out.println("   [숫자맞추기게임 시작]");
                        System.out.println("===========================");
                    	continue;
                    }else {
                    	System.out.println("=====================");
                    	System.out.println("[숫자맞추기게임 종료]");
                    	System.out.println("=====================");
                    	break;
                    }
        		}
        	}
        }
        
        sc.close();
    }
  }

}
