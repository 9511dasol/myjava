package net.hb.day28;

public class Work26_03if {
	public static void main(String[] args) {
	  //int a=3,b=9,c=34;     //System.out.println("영111  "+ a + " " + b + " " + c);
		//int a=3,b=34,c=9;     //System.out.println("영333  "+ a + " " + c + " " + b); 
		
		//int a=37,b=9,c=52;    //System.out.println("영444  "+ b + " " + a + " " + c); 
		//int a=77,b=9,c=52;    //System.out.println("영555  "+ b + " " + c + " " + a);
		
	  //int a=37,b=9,c=1;    //System.out.println("영666  "+ c + " " + b + " " + a);
	  //int a=37,b=89,c=1;    //System.out.println("영222  "+ c + " " + a + " " + b);
		
	  int a=23,b=17,c=20; //각자 변경해보셔요23, 17, 20
	  
		if(a<b && b<c){ 
			 System.out.println("영111  "+ a + " " + b + " " + c);
		}else if(a<b){
			if(c<a) { System.out.println("영222  "+ c + " " + a + " " + b); }
			else { System.out.println("영333  "+ a + " " + c + " " + b);}
		}else if(b<c) { 
			if(a<c) { System.out.println("영444  "+ b + " " + a + " " + c); }
			else { System.out.println("영555  "+ b + " " + c + " " + a); }
		}else {System.out.println("영666  "+ c + " " + b + " " + a); }
		
		
		System.out.println("\n2024-02-28 배열을 이용한 소트");
		int[] lotto  = { 23, 17, 20} ;
		 for(int i=0; i<lotto.length; i++){
			 for(int j=i+1; j<lotto.length;j++){
				  if(lotto[i]>lotto[j]){
				  	int temp=lotto[i];
				  	lotto[i] = lotto[j];
				  	lotto[j] = temp;
				  }
			 }//b end
		 }//a end
		
		 System.out.print("배열이용  ");
		 for(int i=0;i<lotto.length;i++) { System.out.print(lotto[i] +" "); }
		 
	} //end
}//class END


//첫번째 if조건 논리연산
/*
package net.hb.day26;

public class Work26_03if {
	public static void main(String[] args) {
	  //int a=3,b=9,c=34;   //111  3 9 34
		//int a=3,b=34,c=9;     //222  3 9 34
		
		//int a=37,b=9,c=52;  //333  9 37 52
		//int a=77,b=9,c=52;   //444  9 52 77
		
	  //int a=37,b=9,c=1; //666  1 9 37
	  //int a=37,b=89,c=1;  //555  1 37 89
	  int a=1,b=3,c=7;
		//2조장 정윤님껏 소스예제 설명 
		if(a<b && a<c && b<c) {System.out.println("111  "+ a + " " + b + " " + c);}
		else if(a<b && a<c && c<b) {System.out.println("222  "+a + " " + c + " " + b);}
		else if(b<a && b<c && a<c) {System.out.println("333  "+b + " " + a + " " + c);}
		else if(b<c && b<a && c<a) {System.out.println("444  "+b + " " + c + " " + a);}
		else if(c<a && c<b && a<b) {System.out.println("555  "+c + " " + a + " " + b);}
		else {System.out.println("666  "+c + " " + b + " " + a);}
		
	} //end
}//class END 
*/




