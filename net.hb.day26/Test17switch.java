package net.hb.day26;

public class Test17switch {
	public static void main(String[] args) {
		int kor=90, eng=85, total=0;   
		double avg=0.0;
		char grade = 'F';
		
		total = kor+eng;
		avg=(double)total/2;
		System.out.println("총점=" + total);
		System.out.println("평균=" + avg ); //평균=87.5  형변환안했을때 평균87.0출력
	
		
		switch((int)avg/10) { //실수형조건 데이터 에러발생
			case  10: 
			case  9: 
				grade='A'; 
				break;
			case  8: 
				grade='B'; 
				break;
			case 7:
				grade='C'; 	
				break;
			case  6: 
				grade='D';	
				break;	
			default:
				grade='F'; 	
				break;
		}//switch end
		
		/*
		if(avg >= 70) {result="축합격"; }
		else { result="재시험"; }
		
		System.out.println("총점=" + total);
		System.out.println("평균=" + avg + "  평균=" + (int)avg);
		System.out.println("학점=" + grade);
		System.out.println("결과=" + result);
		*/
	}//end
}//class END

























