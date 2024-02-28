package net.hb.day28;

public class Mycamp05 {
	public static void main(String[] args) {
	  //정답 boolean[] camp = new boolean[]{ true,false,false,true,true }; //190페이지  
	  boolean[] camp = { true,false,false,true,true }; //190페이지 수작업 초기값
	  
	   System.out.println("초초간단 예약시작");
	   for(int i=0; i<camp.length; i=i+1) { //187페이지 배열의길이 
	    System.out.println("camp[" + i + "] = "  + camp[i]);
	   }

	}//end
}//class END
