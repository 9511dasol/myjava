package net.hb.day28;

public class Myarray01 {
	public static void main(String[] args) {
	   //int a, b, c, d, e; //20개변수가 필요하면 이름명명 어렵죠 
	   
		 //int[] score = new int[5];
	   //double[] score = new double[5]; //double기본값 0.0
	   //String[] score = new String[5];  //String클래스의 기본값은 null 
	   boolean[] score = new boolean[5]; //boolean기본값 false

	   //System.out.println( a + " " + b + " " + c + " " + d + " " + e);
	   //185페이지 배열 출력
	   for(int i=0; i<5; i=i+1) {
	    System.out.println("배열 = "  + score[i]);
	   }
	}//end
}//class END
