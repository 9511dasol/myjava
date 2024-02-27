package net.hb.day26;

public class Test12bit {
	public static void main(String[] args) {
		//121페이지 bit연산
		int x=3 , y=5 ;  //3=0000 0011   5=0000 0101  
		int a = x&y ;  //and=전부만족해야만 true
		int b = x|y ; //or=두개중에 하나라도 true이면 결과 참
		int c = x^y ; //xor=서로값이 다를때 true
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	} //end
}//class END
