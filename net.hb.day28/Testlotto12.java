package net.hb.day28;

public class Testlotto12 {
	public static void main(String[] args) {
//	 	 int[] lotto28 = new int[6];
//		 for(int i=0; i<lotto28.length; i++) {
//			  lotto28[i] = (int)(Math.random()*45)+1;
//			  for(int j=0 ; j<i ; j++ ) {
//			  	if(lotto28[i] == lotto28[j]) { i--; } 
//			  }//j end
//		 }//i end   
		 	
	 	 //난수발생 주석처리
		 int[] lotto  = { 29, 3, 16, 12,  45,  1 } ;
		 System.out.print("소트전 ");
		 for(int i=0; i<lotto.length; i++) { 
			 System.out.print(lotto[i] + " ");
		 }
		 
		 //소트전  29 3 16 37 45 1
		 for(int a=0; a<lotto.length; a++){//a 기준값 29
			 //a=0일때 29  b=1시작 3
			 for(int b=a+1; b<lotto.length;b++){//b 비교대상 3
				  if(lotto[a]>lotto[b]){
				  	int temp=lotto[a];
				  	lotto[a] = lotto[b];
				  	lotto[b] = temp;
				  }
			 }//b end
		 }//a end
		 
		 System.out.println();
		 System.out.print("소트후 ");
		 for(int i=0; i<lotto.length; i++) { 
			 System.out.print(lotto[i] + " ");
		 }
	}//end
}//class END



