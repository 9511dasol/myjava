package net.hb.day29;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = MakeLotto();
		
		
		System.out.println("이것은 로또 입니다/");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(a[1]);
	}
	
	public static int[] MakeLotto() {
		
		int[] lotto = new int[6];
		//
		// 임의번호 로또
//		double ddd = Math.random();
//		System.out.println("난수<< " + ddd);
//		System.out.println("int<< " + (int)(ddd * 10)+1);
		
		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = (int)(Math.random() * 45) + 1; // (Math.random() * 45) == 0 < x < 45
			int lo = (int)(Math.random() * 45) + 1; // (Math.random() * 45) == 0 < x < 45
			while (Arrays.asList(lotto).contains(lo)) { // 있으면 1 없으면 0
				lo = (int)(Math.random() * 45) + 1;
			}
			lotto[i] = lo;
			
		}
		return lotto;
	}

}
