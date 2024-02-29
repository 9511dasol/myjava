package net.hb.day29;

import java.util.Arrays;

public class MyLotto12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lotto = new int[6];

		
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
		int temp =0;
//		Arrays.sort(lotto); // ==
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 1+i; j < lotto.length; j++) {
				
				
				
				if(lotto[i] > lotto[j]) {
					temp = lotto[j];
					lotto[j] = lotto[i];
					lotto[i] = temp;
				}
			}
			
		}
		System.out.println("난수 로또 << ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " "); // (Math.random() * 45) == 0 < x < 45
		}
	}

}
