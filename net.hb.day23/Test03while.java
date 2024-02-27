package net.hb.day23;

public class Test03while {
	public static void main(String[] args) {
		System.out.println("while(true)반복문");
	  int su=0, total=0 ;
    while(true) { //Test03while.java문서
    	su = su+1;
    	System.out.print(su + " ");  // 1 2 3 4 5 6 7 8 9 10 total=55
    	total = total + su;
    	if(su==10) {break;}
    }
     System.out.println("total=" + total);
	}//end
}//class END
