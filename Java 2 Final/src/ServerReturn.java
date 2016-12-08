import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerReturn implements Runnable{
Socket SOCK;
private Scanner INPUT;
private PrintWriter OUT;
String MSG = "";

public ServerReturn(Socket X){
	this.SOCK=X;
}

public void CheckConnection() throws IOException{
	if(!SOCK.isConnected()){
		for(int i=1;i<Server.ConnectionArray.size();i++){
			if(Server.ConnectionArray.get(i)==SOCK){
				Server.ConnectionArray.remove(i);
			}
		}
		
		for(int i =1;i<=Server.ConnectionArray.size();i++){
			Socket TEMP_SOCK = (Socket) Server.ConnectionArray.get(i-1);
			PrintWriter TEMP_OUT = new PrintWriter(TEMP_SOCK.getOutputStream());
			TEMP_OUT.println(TEMP_SOCK.getLocalAddress().getHostName()+" Disconnect");
			TEMP_OUT.flush();
			System.out.println(TEMP_SOCK.getLocalAddress().getHostName()+" Disconnect");
		}
	}
}

public void run(){
	try{
		try{
			INPUT = new Scanner(SOCK.getInputStream());
			OUT = new PrintWriter(SOCK.getOutputStream());
			
			while(true){
				CheckConnection();
				
				if(!INPUT.hasNext()){
					return;}
				
				MSG = INPUT.nextLine();
				
				System.out.println("Client said : "+ MSG);
				
			for(int i =1;i<=Server.ConnectionArray.size();i++){
				Socket TEMP_SOCK = (Socket) Server.ConnectionArray.get(i-1);
				PrintWriter TEMP_OUT = new PrintWriter(TEMP_SOCK.getOutputStream());
				TEMP_OUT.println(MSG);
				TEMP_OUT.flush();
				System.out.println("Sent to : " + TEMP_SOCK.getLocalAddress().getHostName());
			
			}//close loop
			}//close while
		}//close try
	finally{
		SOCK.close();
	}
	}//close try2
	catch(Exception E){System.out.println(E);}
	
}



}
