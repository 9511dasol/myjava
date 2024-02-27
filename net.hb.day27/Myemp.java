package net.hb.day27;

import java.util.Scanner;

public class Myemp {
	public static void main(String[] args) {
		 //문제 Scanner클래스 단점 숫자입력후 enter치면 다음라인에서 문자입력시 문자값대신enter 
		 int sabun = 241000 ;
     String name = null;
     Scanner scan = new Scanner(System.in);
     System.out.print("사번입력>>> ");
     sabun = Integer.parseInt(scan.nextLine());
     
     System.out.print("이름입력>>> ");
     name = scan.nextLine();
     
     System.out.println();
     System.out.println("사번 = "  + sabun +"\t 이름 = " + name );
     System.out.println("화요일 출석체크");
	}//end
}//class END





