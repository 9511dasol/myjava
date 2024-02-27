package net.hb.day27;

public class Test04jumin {
	public static void main(String[] args) {  
		String jumin = "901124-1857629";
		
		// 1번3번 남자    2번4번 여자 
		char data = jumin.charAt(7); 
	  if(data=='1' || data=='3') {
	  	 System.out.println("당신의 성별은 남자입니다");
	  }else if(data=='2' || data=='4') {
	  	System.out.println("당신의 성별은 여자입니다");
	  }else{ System.out.println("성별이 이상합니다"); }
	 
	}//end
}//class END










