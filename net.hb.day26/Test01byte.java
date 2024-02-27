package net.hb.day26;

public class Test01byte {
	public static void main(String[] args) {
		 //29페이지 자바에서 byte = 1Byte*8bit=8bit  -128 ~ 127사이 정수숫자기억
		 //인텔cpu은 int형으로 인식  
		 byte bvalue1 = 7 ;
		 byte bvalue2 = 9 ;
		 System.out.println( bvalue1  + " " + bvalue2);
		 System.out.println(  "합계 = " + (bvalue1+bvalue2));
		 //에러 byte bvalue3 = bvalue1+bvalue2 ;
		 //에러해결 int bvalue3 = bvalue1+bvalue2 ;  아니면 연산결과를 ( byte )형으로 변환 
		 byte bvalue3 = (byte)(bvalue1+bvalue2) ;
		 System.out.println(  "합계 = " + (bvalue3));
		 
		 //29페이지 자바에서 int = 4Byte*8bit=32bit
		 //29페이지 자바에서 double = 8Byte*8bit=64bit
	   //29페이지 자바에서 boolean = 1Byte*8bit=8bit
	   //29페이지 자바에서 char = 2Byte*8bit=16bit
		 //char타입 int타입 서로 변환가능

	} //end
}//class END
