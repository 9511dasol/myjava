package net.hb.day23;

public class Test12for {
	public static void main(String[] args) {
		//반복문 do{~~}while(조건);  for(){ }  while(조건){}
		System.out.println("for()반복문 12:17 12:21");
    int num = 0, total=0;
    for( int i=0 ; i<10; i=i+1) ; {  //while(true){ } ==   for( ; ; ){}
			num=num+1;
			System.out.print(num + " "); //1 2 3 4 5 6 7 8 9 10 total=55
			total = total + num ;
		} 
    System.out.println("total=" + total);
	}//end
}//class END
