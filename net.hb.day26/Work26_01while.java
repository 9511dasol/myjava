package net.hb.day26;

public class Work26_01while {
	public static void main(String[] args) {
		int su=0;
		while(true){
			su = su + 1 ;
			System.out.print(su + "\t");
			if(su%5==0) {System.out.println();}
			if(su==30) break;
		} 
	} //end
}//class END
