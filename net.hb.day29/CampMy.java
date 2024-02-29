package net.hb.day29;

import java.util.Scanner;

public class CampMy {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자 정의 함수 method 없이 여러분 각자 기술
		// 배열 응용
		System.out.println("1차원 배열 캠프 예약..");
		
		boolean[] camp = new boolean[5];
		
		Scanner scan = new Scanner(System.in);
		
		int sel = 9, num = 0;
		
		
		System.out.println("*-------------------------------------------*");
		
		boolean capm = true;
		// 1. 예약, 2. 퇴실, 3. 상황 9. 종료
		while(capm) {
			System.out.print("1. 예약 2. 퇴실 3. 상황 9. 종료 \n>>> ");
			sel = scan.nextInt();
			switch (sel) {
			case 9:
				System.out.println("캠프 예약 프로그램을 종료합니다.");
				capm = false;
				break;
				
			case 1:
				System.out.println("캠프 예약을 선택하셨습니다.");
				int su = 0;
				for (int i = 0; i < camp.length; i++) {
					boolean b = camp[i];
					if(b) {
						System.out.println("x"+"["+ (i+1) +"]" + " camp 사용중입니다.");
						su++;
					} else {
						System.out.println("x"+"["+ (i+1) +"]" + " camp 이용가능합니다.");
					}
				}
				
				if(su == 5) {
					System.out.println("만실입니다. \n초기 메뉴로 돌아갑니다.");
					break;
				}
				
				boolean sc = true;
				while(sc) {
					System.out.print("몇 번째를 선택하시겠습니까 ?");
					int select = scan.nextInt();
					
					if(select > 5 || select < 0) {
						System.out.println("예약 범위를 벗어났습니다. \n다시 입력해주십시오.");
						for (int i = 0; i < camp.length; i++) {							
							if(camp[i]) {
								System.out.println("x"+"["+ (i+1) +"]" + " camp 사용중입니다.");
								su++;
							} else {
								System.out.println("x"+"["+ (i+1) +"]" + " camp 이용가능합니다.");
							}
						}
					}
					else if(camp[select-1]) {
						System.out.println("사용중입니다. \n다시 확인하여 주십시오.");
						System.out.println("camp[" + select + "]방은 이용중입니다.");
					}
					else{ 
						System.out.println("예약 되었습니다. \n감사합니다.");							
						camp[select - 1] = true;
						sc = false;
						break;
					}
				}
				break;
				
			case 2:
				System.out.println("캡프 퇴실을 선택하셨습니다.");				
				boolean t = true;
				
				while(t) {
					int suu = 0;
					for (int i = 0; i < camp.length; i++) {
						boolean b = camp[i];
						if(b) {
							System.out.println("x"+"["+ (i+1) +"]" + " camp 사용중");
						} else {
							System.out.println("x"+"["+ (i+1) +"]" + " camp 이용가능");
							suu ++;
						}
					}
					if(suu > 4) {
						System.out.println("이용중인 또는 중이었던 방이 없으므로 초기 메뉴로 돌아갑니다.");
						t = false;
						break;
					}
					
					System.out.print("몇 번째를 방을 사용하셨습니까 ? >> ");
					int select2 = scan.nextInt();
					
					if(camp[select2-1]) { // true
						System.out.println("감사합니다 퇴실 완료되었습니다.");
						camp[select2-1] = false;
						t = false;
						break;
					}
					else {
						System.out.println("방이 원래 공실이거나 사용중이 아닙니다. \n다시 확인하여 주십시오.");
					}
				}
				break;
				
			case 3:
				System.out.println("캠프 현재 현황 확인 버튼을 입력하셨습니다");
				for (int i = 0; i < camp.length; i++) {
					boolean b = camp[i];
					if(b) {
						System.out.println("x"+"["+ (i+1) +"]" + " ■ camp 사용중입니다.");
					} else {
						System.out.println("x"+"["+ (i+1) +"]" + " □ camp 이용가능합니다.");
					}
				}
				break;
				
			default:
				System.out.println("위 적혀있는 번호를 정확히 입력하여 주십시오. \n\n");
				break;
			}
		}
	}

}
	
