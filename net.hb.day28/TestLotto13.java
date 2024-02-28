package net.hb.day28;

import java.util.Arrays;

public class TestLotto13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 34, b = 9, c= 45, d = 27, e = 16,  f = 23;
		
		int[] lotto = new int[6];
//		lotto[0] = 34; lotto[1] = 9;
//		lotto[3] = 27; lotto[2] = 45;
//		lotto[5] = 16; lotto[4] = 0+23;
//		Arrays.sort(lotto);
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.println(lotto[i]);
//		}
		
		// 임의번호 로또
		double ddd = Math.random();
		System.out.println("난수<< " + ddd);
		System.out.println("int<< " + (int)(ddd * 10)+1);
		
		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = (int)(Math.random() * 45) + 1; // (Math.random() * 45) == 0 < x < 45
			int lo = (int)(Math.random() * 45) + 1; // (Math.random() * 45) == 0 < x < 45
			while (Arrays.asList(lotto).contains(lo)) { // 있으면 1 없으면 0
				lo = (int)(Math.random() * 45) + 1;
			}
			lotto[i] = lo;
			
		}
		
		Arrays.sort(lotto);
		System.out.println("난수 로또 << ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " "); // (Math.random() * 45) == 0 < x < 45
		}
	}

}
