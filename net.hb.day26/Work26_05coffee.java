package net.hb.day26;

import java.util.Scanner;

public class Work26_05coffee {
	public static void main(String[] args) {
	  //해결1] Scanner클래스 키보드입력 
	  //해결2] scan.nextLine()문자열입력 int형변환 Integer.parsetInt(String)
	  //해결3] 반복문 while(true){  }
	  //해결4] 제어문 if~else if~else	
	  //해결5] 변수이름 통일, 필요한 변수 더 개인적으로 추가 
		//배열사용금지, bit연산금지,  연산처리도 더 개인적으로 추가  
		int sel=9, money=0, i=0,j=0,k=0;
		String message="", info="", result="";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액입력 >>> "); //500입력후  나중에 로직이 이해되면 600원입력  200원
		String data = scan.nextLine();
		//대신 money = scan.nextInt(); //비권장
		money = Integer.parseInt(data); //권장
		
		while(true) {
			System.out.println("\n\t*------ 커피 자판기 ------*");
			System.out.println("1.커피(300)  2.코코아(250)  3.반환  9.종료");
			System.out.print("메뉴선택 >>> ");
			//sel = scan.nextInt(); //비권장
			sel = Integer.parseInt(scan.nextLine());  //권장
			
			if(sel==9){
				System.out.println("커피머신 프로그램을 종료합니다");
				break;
			}
		}//while end
	
	} //end
}//class END




