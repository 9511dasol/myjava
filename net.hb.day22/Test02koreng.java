package net.hb.day22;

public class Test02koreng {
	public static void main(String[] args) {
		int kor=90, eng=85, total=0;   
		double avg=0.0;
		
		total = kor+eng;
		avg=(double)total/2;  //87.5출력
		//정석   avg=total/2; 87.0출력
		//비권장int  myavg=total/2;  87출력
		
		System.out.println("총점=" + total);
		System.out.println("평균=" + avg);
		//System.out.println("평균=" + myavg);
	}//end
}//class END
