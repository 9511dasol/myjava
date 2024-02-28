package net.hb.day28;

public class Test13if {
	public static void main(String[] args) {
		 int[] lotto  = {  77, 9, 88 } ;
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
		 
		  int a=77,b=9,c=88;
			//2조장 정윤님껏 9 77 88
			if(a<b && a<c && b<c) {System.out.println("조장111  "+ a + " " + b + " " + c);}
			else if(a<b && a<c && c<b) {System.out.println("조장222  "+a + " " + c + " " + b);}
			else if(b<a && b<c && a<c) {System.out.println("조장333  "+b + " " + a + " " + c);}
			else if(b<c && b<a && c<a) {System.out.println("조장444  "+b + " " + c + " " + a);}
			else if(c<a && c<b && a<b) {System.out.println("조장555  "+c + " " + a + " " + b);}
			else {System.out.println("조장666  "+c + " " + b + " " + a);}
	}//end
}//class END



