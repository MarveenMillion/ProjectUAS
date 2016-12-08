import java.io.*;
import java.net.*;
import java.util.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Server {
	public static ArrayList<Socket> ConnectionArray = new ArrayList<Socket>();
	public static ArrayList<String> CurrentUsers = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException{
	 try{
		 	final int PORT =1022; 
		 	ServerSocket SERVER = new ServerSocket(PORT);
		 	System.out.println("Waiting for Clients ....");
		 	
		 	while(true){
		 		Socket SOCK = SERVER.accept();
		 		ConnectionArray.add(SOCK);
		 		
		 		System.out.println("Client connected from :" +SOCK.getLocalAddress().getHostName());
		 		
		 		AddUserName(SOCK);
		 		
		 		ServerReturn CHAT = new ServerReturn(SOCK);
		 		Thread X = new Thread(CHAT);
		 		X.start();
		 	}
		 	}
	 catch(Exception X){
		 System.out.print(X);
	 }
	}
	
	 public static void AddUserName(Socket X) throws IOException{
		 Scanner INPUT = new Scanner(X.getInputStream());
		 String username = INPUT.next();
		 CurrentUsers.add(username);
		 
		 for(int i=1; i<=Server.ConnectionArray.size(); i++){
			 Socket TEMP_SOCK = (Socket) Server.ConnectionArray.get(i-1);
			 PrintWriter OUT = new PrintWriter(TEMP_SOCK.getOutputStream());
			 OUT.println("#?!" + CurrentUsers);
			 OUT.flush();
		 }
		 
	 }
	
}


