package net.hb.day27;

import java.util.Scanner;

public class Mycoffee {

	public static void main(String[] args) {
		int sel = 9, money = 0, i = 0, j = 0;
		String message="안내";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 투입하세요>>> ");
		money = Integer.parseInt(sc.nextLine());
		int fristMoney = money;
		
		while(true) {
			System.out.println(" ======== 커피 자판기 ========");
			System.out.print("1.커피(200) 2.코코아(250)  3.반환  9.종료");
			System.out.println();
			System.out.print("메뉴선택 >>> ");
			String menu = sc.nextLine();
			
			sel = Integer.parseInt(menu);
			
			if(sel==9) {
				System.out.println("커피프로그램 종료합니다.");
				break;
			}

			// 메뉴 선택
			// 커피
			if(sel==1) {
				message=" 커피음료를 선택하셨군요";
				if(money<200) {
					message="금액 200원미만이므로 주문할 수 없습니다.";
				}else {
					// 커피 구매 
					money -= 200;					
				}
			}
			// 코코아
			else if(sel==2) {	
				message=" 코코아음료를 선택하셨군요";
				if(money<250) {
					message="금액 250원미만이므로 주문할 수 없습니다.";
					
				}else {
					// 코코아 구매
					money -= 250;
				}
			}
			// 반환
			else if(sel==3) {
				message=" 거래취소했습니다. 금액이 반환됩니다.";
				// 금액 반환
				//money = fristMoney;
			}
			// 종료
			else if(sel==9) {
				message=" 커피 프로그램을 종료합니다.";
			}
			// 예외처리
			else {
				message=" 음료선택을 안하셨군요";
			}	
			System.out.println();
			System.out.println(message);
			System.out.println();
		}// 메뉴 while 종료
		
		sc.close();
	
		System.out.println();
		
		// 잔액 표기
		System.out.println("잔액 : " + money);
			
	}//end
}//class END
























