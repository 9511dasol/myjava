package net.hb.day27;

import java.util.Scanner;

public class Mygugudan {
	public static void main(String[] args) {	
		int dan = 1; 
		Scanner scan = new Scanner(System.in);
		
		try {
		  System.out.print("Mygugudan 단입력 >>> ");    
		  dan=scan.nextInt() ;
		}catch(Exception ex) { }
	  
    for(int i=1; i<10; i=i+1) {
    	System.out.println(dan+"*"+i+"="+(dan*i));
    }
    
    scan.close(); 
    
    int a=9,b=5;
    int hap=0, nmg=0;
    double mok = 0.0;

     mok=a/b ; //몫연산
     nmg=a%b ; //나머지연산
     hap=a+b ; //더하기연산 만능
     System.out.println(); // <br>역할
     System.out.println("몫 = " + mok);
     System.out.println("나 = " + nmg);
     System.out.println("합 = " + hap);
     System.out.println("마지막처리 필수");
	}//end
}//class END
