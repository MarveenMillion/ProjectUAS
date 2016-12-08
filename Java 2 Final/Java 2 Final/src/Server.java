import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
private static final int PORT = 9095;

public static void main(String[] args) throws IOException{
	 System.out.println("The server is running on" + PORT);
	 ServerSocket listener = new ServerSocket(PORT);
	 try{
		 while(true){
			 Socket s = listener.accept();
			 Thread t = new Reversal(s);
			 t.start();
			 
			 
		 }
	 }
	 finally{
		 listener.close();
	 }
	 
	}
}

class Reversal extends Thread{
	private Socket socket;
	private String client;
	
	Reversal(Socket s){
		socket = s;
		client = s.getRemoteSocketAddress().toString();
		System.out.println("Incoming connection from "+client);
	}
	private static String reverse(String str){
		StringBuilder sb = new StringBuilder();
		int len = str.length();
		for (int i = len-1; i>= 0; i--)
			sb.append(str.charAt(i));
		return sb.toString();
	}
	
public void run(){
	try{
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		out.println("Welcome to the Jungle");
		out.println("Enter a line with only a period to quit\n");
		
		while(true){
			String input = in.readLine();
			if(input == null || input.equals(".")) break;
			System.out.println("Reversal request for"+input);
			out.println(reverse(input));
		}
	}
	catch(IOException e){
		System.out.println("Error" + client + ":"+e);
	}
	finally{
		try{
			socket.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		System.out.println("Close connection from " +client);
	}
}
}
