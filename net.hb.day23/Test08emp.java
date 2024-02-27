package net.hb.day23;

import java.util.Scanner;

public class Test08emp {
	public static void main(String[] args) {
		 //문제 Scanner클래스 이름데이터입력, 주소데이터입력  반복문X,제어문X
     String name="", juso="";
     Scanner scan = new Scanner(System.in);
     System.out.print("이름입력>>> ");
     name = scan.nextLine();
     System.out.print("주소입력>>> ");
     juso = scan.nextLine();
     
     System.out.println(); //<br>역할 구분
     System.out.println("이름 = " + name +" 주소 = " + juso);
     
     scan.close();
	}//end
}//class END





