package net.hb.day29;

public class MyCal {
	public static void main(String[] args) {
		int kor = 90, eng = 85;
		mytotal(kor, eng);
	}
	public static void mytotal(int x, int y) {
		System.out.println("호출된 함수의 결과는 x + y = " + (x+y));
	}
	
	public static int price() {
		int money = 4500;
		return money;
	}
	public static String book() {
		return "책";
	}
	public static void note() {
		System.out.println("note() method");
		String a = book();
		int b = price();
	}
	public static double Point() {
		double a = 39.8;
		return a;
				
	}
	public static boolean getGender() {
		boolean data = true;
		return data;
	}
}
