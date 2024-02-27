package net.hb.day26;

public class Test02char {
	public static void main(String[] args) {
		//int, char타입은 ascii=American Standard Code for Information Interchange 
		//char연산을 하면 ascii코드값 연산  0:48  1:49 2:50~~ A:65 B:66~ a:97 b:98 c:99
		char a='c'; //99
		char b='0'; //48
		System.out.println(a+b); //147
		System.out.println(a+" "+b+" ");  // c 0
		System.out.println();
		int x = (int)a ; //char타입 int형변환은 자동으로 아스키코드값 
		int y = (int)b ; 
		System.out.println(x+" "+y+" "); 
		
		
		//29페이지 자바에서 int = 4Byte*8bit=32bit
	  //29페이지 자바에서 char = 2Byte*8bit=16bit
	} //end
}//class END




