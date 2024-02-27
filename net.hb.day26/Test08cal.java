package net.hb.day26;

public class Test08cal {
	public static void main(String[] args) {
    int a=4, b=4, tot=0, hap=0;
    //++a ; 단독으로 기술할때 ++앞  --앞  a=a+1; a=a-1;
    //b++ ; 단독으로 기술할때 앞++  앞--  b=b+1; b=b-1;
    tot = a++ + 3 ; //뒤에++ 있으면 먼저계산후 증감  4+3=7 a=5 
    hap = ++b + 3 ; //앞에++ 있으면 먼저증감후 연산  5+3=8 b=5
    System.out.println("a="+ a + "\t tot=" + tot);
    System.out.println("b="+ b + "\t hap=" + hap);
	} //end
}//class END
