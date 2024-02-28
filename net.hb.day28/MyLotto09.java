package net.hb.day28;

public class Mylotto09 {
	public static void main(String[] args) {
	   //int a=34, b=9, c=45, d=27, e=16, f=23;
	   
		 int[] lotto = new int[6];
		 lotto[0] = 34 ; 	lotto[1] = 9 ;
		 lotto[2] = 45 ; 	lotto[3] = 27 ;
		 lotto[4] = 16 ;  lotto[5] = 23 ;
		 for(int i=0; i<lotto.length; i++) {
			 System.out.print(lotto[i] + " ");
		 }
		 
		 
		 System.out.println();
		 //489페이지 ~ 490페이지 Math클래스 random()메소드 0.00000~0.99999난수
		 //489페이지 ~ 490페이지 Math클래스 double random()메소드 0.00000~0.99999난수
		 double dd  = (Math.random()*10)+1;
		 System.out.println("난수 = " + dd);
		 int value =  (int)dd ; 
		 //해결1 double형을 int형변환
		 //해결2 1~10사이 정수숫자 발생
		 System.out.println("난수 = " + value);
	}//end
}//class END



