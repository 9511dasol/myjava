package net.hb.day26;

public class Work26_04reverse {
	public static void main(String[] args) {
	  int su = 5942; 
	  int mok=0, nmg=0;
	  System.out.println("원본 " + su);  //5942
	  
	  System.out.print("역순 " ); //2495
	  //문제해결 산술연산 /몫  %나머지   5942/10=594    5942%10=2 
	  //문제해결 산술연산 /몫  %나머지   594/10=59      594%10=4 
	  while(true) {
	     nmg = su%10;
	     mok = su/10;
	     su=mok;
	     System.out.print(nmg);
	     if(su==0)break;
	  }//while end
	  
	} //end
}//class END

