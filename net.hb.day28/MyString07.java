package net.hb.day28;

import java.util.Arrays;

public class MyString07 {
	public static void main(String[] args) {
     char[] data = { 'k', 'i', 'm', 'L','G' };  
     System.out.println(data);  //출력  kimpark
     System.out.println(data.toString()); //출력  [C@515f550a
     System.out.println(Arrays.toString(data)); //출력 [k, i, m, p, a, r, k]
     for(int i=0; i<data.length; i++) {
    	 System.out.print(data[i]);  //출력  kimpark
     }
     System.out.println( );
     
     //String str = new String(data); //정석 
     //System.out.println(str);
     //String name = "kimpark"; //해법 권장
     //System.out.println(name);
     //209페이지 char확장해서 편하게 접근 String문자열클래스
     //String문자열클래스 주요메소드  char  charAt(int)   int  length()
     //String문자열클래스 주요메소드  String  substring(int,int)   
     //String문자열클래스 주요메소드  boolean equals(객체) 
     //String문자열클래스 주요메소드  char[] toCharArray()
	}//end
}//class END
