package net.hb.day23;

public class Test17switch {
	public static void main(String[] args) {
		int kor=100, eng=100, total=0;   
		double avg=0.0;
		String result="" ;
		char grade='F';
	
		total = kor+eng;
		avg=(double)total/2;
		
		//if(avg>=90){ grade='A'; }
		//else if(avg>=80){ grade='B'; }
		//else if(avg>=70){ grade='C'; }
		//else if(avg>=60){ grade='D'; }
		//else { grade='F'; }
		//if~else if~else주석처리 
		//switch(실수형에러){  case 값: 처리; break; ~~ default: 처리;break;}
		
		switch((int)avg/10) { //실수형데이터은 에러발생해서 (int)
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
		
		
		if(avg >= 70) {result="축합격"; }
		else { result="재시험"; }
		
		System.out.println("총점=" + total);
		System.out.println("평균=" + avg + "  평균=" + (int)avg);
		System.out.println("학점=" + grade);
		System.out.println("결과=" + result);
	}//end
}//class END

























