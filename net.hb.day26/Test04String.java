package net.hb.day26;

public class Test04String {
	public static void main(String[] args) {
		double avg = 78.9 ; //8Byte
		int a = (int)avg ;  //4Byte
    System.out.println(avg +"  " +a);
    
    String data="12007" ;
    //int c = (int)data ;  String형 int형으로 변환X
    int b = Integer.parseInt(data); //(int)대신 Integer이용
    System.out.println(data + 31);
    System.out.println(b + 31);
    
		//표준타입끼리 변환  (변환타입)데이터
    //문자열 String title = "봄날 월요일";
		//https://docs.oracle.com/javase/8/docs/api/
		//https://docs.oracle.com/javase/7/docs/api/
		//왼쪽상단 java.lang
	  //왼쪽하단 String클래스  public class String{ 문자열제어" " }
	} //end
}//class END
