package net.hb.day28;

import java.util.Arrays;

public class Mycamp06 {
	public static void main(String[] args) {
	  //정답 boolean[] camp = new boolean[]{ true,false,false,true,true }; //190페이지  
	  boolean[] camp = { true,false,false,false,true }; 
	  //191페이지 출력 Arrays.toString(camp)
	  
	   System.out.println("초초간단 예약시작");
	   //for(int i=0; i<camp.length; i=i+1) {System.out.println("camp[" + i + "] = "  + camp[i]);  }
     System.out.println(Arrays.toString(camp));

     System.out.println("\n191페이지 chArr배열");
     char[] chArr = { 'a', 'b', 'c', 'd' };  //char타입배열은 String문자열
     System.out.println(chArr);
     String data = "abcd";
     System.out.println(data);
     
	}//end
}//class END
