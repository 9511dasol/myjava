package net.hb.day28;

public class Myarray02 {
	public static void main(String[] args) {
		//문제해결 try{ }catch(Exception e){ }
		
	  int[] score = new int[5];
	  try {
	   System.out.println("배열명[0] = "  + score[0]);
	   System.out.println("배열명[1] = "  + score[1]);
	   System.out.println("배열명[2] = "  + score[2]);
	   System.out.println("배열명[7] = "  + score[7]);
	   System.out.println("배열명[4] = "  + score[4]);
	   System.out.println();
	  }catch (Exception e) {	}
	
	 try {
	   for(int i=0; i<30; i=i+1) {
	    System.out.println("score["+ i+"]="  + score[i]);
	   }
	 }catch (Exception e) { }

	   System.out.println();
	   System.out.println("주차영수증 대체필요 9:33");
	   System.out.println("상품권 결재영수증 9:34");
	}//end
}//class END
