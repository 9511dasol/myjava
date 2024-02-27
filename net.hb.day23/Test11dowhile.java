package net.hb.day23;

public class Test11dowhile {
	public static void main(String[] args) {
		//반복문 do{~~}while(조건);  for(){ }  while(조건){}
		System.out.println("do{}while()반복문");
    int num = 30, total=0;
    do {
			num=num+1;
			System.out.print(num + " "); //1 2 3 4 5 6 7 8 9 10 total=55
			total = total + num ;
		} while(num<10);
    System.out.println("total=" + total);
	}//end
}//class END
