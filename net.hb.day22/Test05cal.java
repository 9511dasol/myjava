package net.hb.day22;

public class Test05cal {
	public static void main(String[] args) {
		int a=15,b=9 ;
		int hap=0, sub=0, gob=0, mok=0, nmg=0 ;
		
		hap = a+b ;
		sub = a-b ;
		gob = a*b ;
		mok = a/b ; //몫
		nmg = a%b ; //나머지 
		
		//키보드에서 데이터입력  Scanner sc =  new Scanner(System.in) ;
	  System.out.println(a+"+"+b+"="+hap);
	  System.out.println(a+"-"+b+"="+sub);
	  System.out.println(a+"*"+b+"="+gob);
	  System.out.println(a+"/"+b+"="+mok);
	  System.out.println(a+"%"+b+"="+nmg);
	}//end
}//class END
