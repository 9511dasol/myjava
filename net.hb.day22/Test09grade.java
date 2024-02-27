package net.hb.day22;

public class Test09grade {
	public static void main(String[] args) {
		int kor=70, eng=85, total=0;   
		double avg=0.0;
		String result="" ;
		char grade='F';
	
		total = kor+eng;
		avg=(double)total/2;
		
		//if~else if~else if~else if~else 학점 
		//100~90 A, 89~80 B, 79~70 C, 69~60 D, 0~59 F
		if(avg>=90){ grade='A'; }
		if(avg>=80){ grade='B'; }
		if(avg>=70){ grade='C'; }
		if(avg>=60){ grade='D'; }
		else { grade='F'; }
		
		if(avg >= 70) {result="축합격"; }
		else { result="재시험"; }
		
		System.out.println("Test09grade 3:39");
		System.out.println("국어=" + kor);
		System.out.println("영어=" + eng);
		System.out.println("총점=" + total);
		System.out.println("평균=" + avg);
		System.out.println("학점=" + grade);
		System.out.println("결과=" + result);
	}//end
}//class END













