package net.hb.day23;

public class Work01if {
	public static void main(String[] args) {
		int a=9, b=8, c=4 ; //적은숫자출력   원본a=9, b=8, c=4 
		//int a=9, b=12, c=4 ; //적은숫자출력  c=4대신 c=10지정하면 

		//은정조장님
		if(a>b && b>c) {System.out.println(c+" "+b+" "+a);}
		else if(b>c && c>a) {System.out.println(a+" "+c+" "+b);}
		else if(c>b && b>a) {System.out.println(a+" "+b+" "+c);}
		else if(a>c && c>b) {System.out.println(b+" "+c+" "+a);}
		else if(b>a && a>c) {System.out.println(c+" "+a+" "+b);}
		else {System.out.println(b+" "+a+" "+c);}
		
		
		/*if(a>b && b>c) { 
			 if(b>c) { System.out.println("111 " + a+" "+b+" "+c); }
			 else {System.out.println("222 " + a+" "+c+" "+b); }
		}else if( a<b) { 
			if(b>c) { System.out.println("333 " +b+" "+a+" "+c); } // 12>4
			else if(c>a) {System.out.println("444 " +b+" "+c+" "+a); }
		}*/
		
	}//end
}//class END
