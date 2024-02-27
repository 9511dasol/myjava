package net.hb.day26;

public class Test03char {
	public static void main(String[] args) {
		//char타입 ascii=American Standard Code for Information Interchange  
		//ascii코드  0:48 1:49 ~ 8:56 9:57  A:65 B:66 Z:90 a:97 b:98 c:99 z:122
		char hap='c'; //99
		char tot='A'; //65
		System.out.println(hap+" "+tot+" "); 
		int kor = (int)hap ;  
		int eng = (int)tot ; 
		System.out.println(kor+" "+eng+" "); 
		
		char x = (char)kor ;
		char y = (char)eng ;
		System.out.println(x+" "+y+" "); 
	} //end
}//class END




