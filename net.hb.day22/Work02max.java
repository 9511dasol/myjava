package net.hb.day22;

public class Work02max {
	public static void main(String[] args) {
		int a=5, b=12, c=3; 
		int temp=0;
		//가장큰숫자출력
		if(a>b) { temp=a; }  //5>12 처리못함
		if(b>a) { temp=b;}   //12>5 처리함 temp=12
		if(c>temp) { temp=c; } //3>12 처리못함
	  System.out.println("최대값 = " + temp );
	}//end
}//class END


