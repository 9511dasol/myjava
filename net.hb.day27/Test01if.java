package net.hb.day27;

public class Test01if {
	public static void main(String[] args) {
	   int kor = 90 , eng = 85 ;
	   //해결1  kor데이터, eng데이터 같은지 비교 
    if(kor == eng) {System.out.println("국어 영어점수는 동점입니다"); }
    else {System.out.println("같은점수가 아닙니다"); }
    System.out.println( );
    
    //String  a = "kim" ;
    //String  b = "kim" ;
    String  a = new String("kim") ;
    String  b = new String("kim") ;
    if(a == b) {System.out.println("kim 데이터 동일합니다"); }
    else {System.out.println("다른데이터 입니다"); }
	}//end
}//class END
