package net.hb.day23;

public class Test15break {
	public static void main(String[] args) {
		//break,continue
		boolean boolflag=false;		
		String name="kim" ;
		int age = 23 ;
		//break; //loop반복 아니면 switch제어문
		//continue;  //loop반복
		//return ; //자바에서 return 문장은 마지막에 기술  
		if(boolflag==true) {
			System.out.printf("이름=%s 나이=%d\n" ,  name, age );
			System.out.println("이름=" + name + " 나이="+ age);
		}
		System.out.println("Test15 마지막문장 출력");
	}//end
}//class END
