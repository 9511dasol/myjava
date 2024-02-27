package net.hb.day27;

import java.util.Scanner;

public class Test05gugudan {
	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단입력 >>> ");
	  int dan=scan.nextInt() ;
    for(int i=0; i<10; i=i+1) {
    	System.out.println(dan+"*"+i+"="+(dan*i));
    }
    
    scan.close(); //java.io팩키지및 java.net팩키지에서  ~~.close()닫기
    System.out.println("오늘 월요일 내일 화요일");
    System.out.println("주차 무사통과 ");
	}//end
}//class END
