package net.hb.day27;

import java.util.Scanner;

public class Mygugudanexception {
	public static void main(String[] args) {	
		int dan = 1; 
		Scanner scan = new Scanner(System.in) ; 
		
		try {
		  System.out.print("Mygugudan 단입력 >>> ");    
		  dan=scan.nextInt() ;
		}catch(Exception ex) { }
	  
    for(int i=1; i<10; i=i+1) {
    	System.out.println(dan+"*"+i+"="+(dan*i));
    }
    
    scan.close(); 
	}//end
}//class END
