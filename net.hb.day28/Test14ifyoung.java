package net.hb.day28;

public class Test14ifyoung {
	public static void main(String[] args) {
		 int[] lotto  = { 23, 17, 20} ;
		 for(int a=0; a<lotto. length; a++){
			 for(int b=a+1; b<lotto.length;b++){
				  if(lotto[a]>lotto[b]){
				  	int temp=lotto[a];
				  	lotto[a] = lotto[b];
				  	lotto[b] = temp;
				  }
			 }//b end
		 }//a end
		
		 System.out.print("배열이용  ");
		 for(int i=0;i<lotto.length;i++) { System.out.print(lotto[i] +" "); }
		 System.out.println();
		 
		  int a=23,b=17,c=20;  
			if(a<b && b<c){ 
				 System.out.println("영111  "+ a + " " + b + " " + c);
			}else if(a<b){
				if(c<a) { System.out.println("영222  "+ c + " " + a + " " + b); }
				else { System.out.println("영333  "+ a + " " + c + " " + b);}
			}else if(b<c) { 
				if(a<c) { System.out.println("영444  "+ b + " " + a + " " + c); }
				else { System.out.println("영555  "+ b + " " + c + " " + a); }
			}else {System.out.println("영666  "+ c + " " + b + " " + a); }
	}//end
}//class END



