package net.hb.day27;

public class Mycal {
	public static void main(String[] args) {
	    int a=19,b=0;
	    int hap=0, nmg=0;
	    double mok = 0.0;
   
	    try {
	      mok=a/b ; //몫연산
	      nmg=a%b ; //나머지연산
	    }catch(Exception e) { }
	    
       hap=a+b ;
       
	     System.out.println("몫 = " + mok);
	     System.out.println("나 = " + nmg);
	     System.out.println("합 = " + hap);
	     System.out.println("화요일 출석체크");
	    
	}//end
}//class END
