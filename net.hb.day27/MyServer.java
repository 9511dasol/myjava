package net.hb.day27;



import java.io.IOException;
import java.net.ServerSocket;

//public class MyServer {
//	public static void main(String[] args) throws IOException {
//			ServerSocket ss = new ServerSocket();
//	}//end
//}//class END


public class MyServer {
	public static void main(String[] args) {
			
			try {
				ServerSocket ss = new ServerSocket();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{ System.out.println("에러상관없이 무조건실행"); }
	
	}//end
}//class END
