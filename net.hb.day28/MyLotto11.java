package net.hb.day28;

import java.util.Random;

public class Mylotto11 {
	public static void main(String[] args) {
	 	 int[] lotto = new int[6];
		 for(int i=0; i<lotto.length; i++) {
			 System.out.print(lotto[i] + " ");
		 }  System.out.println();
		 
		 //500페이지 java.util팩키지 Random클래스  
		 //490페이지 Math클래스 double random()메소드 0.00000~0.99999난수
		 double dd  = (Math.random()*10)+1; //1~10
		 System.out.println("난수 = " + dd);
		 System.out.println("Math클래스 난수 = " + (int)dd);
				 
		 //Random rd = new Random();
		 int com = new Random().nextInt(10)+1; //1~10
		 System.out.println("익명Random 난수 = " + com);
		 System.out.println("rd선언안하고 접근 익명의개체" );
		 
		 //28일 수요일 오후수업  Math클래스 double random()메소드이용해서 로또 1~45숫자발생
		 //28일 수요일 오후수업  중복체크, 소트기술 낮은숫자순으로 
	}//end
}//class END



