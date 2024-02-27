package net.hb.day27;

public class Test03String {
	public static void main(String[] args) {  
		//https://docs.oracle.com/javase/8/docs/api/
		char data[] = { 'k', 'i', 'm'} ; //배열로 한글자씩 지정후 String에 넘김
		String  str = new String(data) ;
		
		String a = new String("kim") ;
		String b = "kim" ; //가장많이 사용
		
		System.out.println("두번 " + a);
		System.out.println("세번 " + b);
		System.out.println("정석 " + str);
	}//end
}//class END










