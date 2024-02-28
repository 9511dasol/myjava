package net.hb.day28;

import java.util.Random;

public class Mylotto10 {
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
				 
		 Random rd = new Random();
		 int com = rd.nextInt(10)+1; //1~10
		 System.out.println("Random 난수 = " + com);
	}//end
}//class END



