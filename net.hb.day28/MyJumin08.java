package net.hb.day28;

import java.util.Arrays;

public class Myjumin08 {
	public static void main(String[] args) {
		 //String jumin= "961024-1837629";
		 String jumin1= "961024";
		 String jumin2= "183629";
     //문제1 문자열길이  length()  앞6자릿수-뒷7자릿수 비교  
		 //참고 char data = jumin.charAt(7); 
		 int size1 = jumin1.length() ;
		 int size2 = jumin2.length() ;
		 if(size1==6 && size2==7) { System.out.println("주민번호 자릿수길이 맞습니다"); }
		 else { System.out.println("주민번호 자릿수길이 틀립니다"); } 
		 
		 String jumin= "961105-1837629";
		 //10월24일 생일입니다   String  substring(int시작위치,int끝위치+1) 
		 String  month = jumin.substring(2,4) ;
		 System.out.print("당신의 생일은 " + month + "월 ");
		 String  day = jumin.substring(4,6) ;
		 System.out.println( day + "일 입니다");
		 
     //209페이지 String클래스 메소드 
     //String문자열클래스 주요메소드  char  charAt(int)   int  length() 문자열길이
     //String문자열클래스 주요메소드  String  substring(int시작위치,int끝위치+1)   
     //String문자열클래스 주요메소드  boolean equals(객체) 
     //String문자열클래스 주요메소드  char[] toCharArray()
	}//end
}//class END
