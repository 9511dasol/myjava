package net.hb.day23;

public class Test13for {
	public static void main(String[] args) {
		//반복문 do{~~}while(조건);  for(){ }  while(조건){}
		System.out.println("Test13for");
    int num = 0 ;
    for( int i=0 ; i<10; i=i+1) { 
			num=num+1;
			if(num==5) {continue;}
			System.out.print(num + " "); //1 2 3 4 6 7 8 9 10 
		}//for end     
	}//end
}//class END
