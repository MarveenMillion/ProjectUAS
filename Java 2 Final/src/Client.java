import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Client implements Runnable{
	Socket SOCK;
	Scanner INPUT;
	Scanner SEND = new Scanner(System.in);
	PrintWriter OUT;
	
	public Client(Socket X){
		this.SOCK = X;
	}
	
	public void run(){
		try{
			try{
				INPUT = new Scanner(SOCK.getInputStream());
				OUT = new PrintWriter(SOCK.getOutputStream());
				OUT.flush();
				Checkstream();
			} finally{
				SOCK.close();
			}
		}
		catch(Exception X){System.out.print(X);}
		
	}
	
	public void DC() throws IOException{
		OUT.println(Yuhuu.username +" has Disconnect ");
		OUT.flush();
		//SOCK.close();
		JOptionPane.showMessageDialog(null, "Bye !");
		//System.exit(0);
		Yuhuu.disp();
		String tes = Yuhuu.username;
		
		/*for(int i=1;i<=Server.ConnectionArray.size();i++){
			if(Server.CurrentUsers[i]==tes){
				
			}
		}*/
	}
	
	public void Checkstream(){
		while(true){
				RECEIVE();	
		}
	}
	
	public void RECEIVE(){
		if(INPUT.hasNext()){
			String MSG = INPUT.nextLine();
			
			if(MSG.contains("#?!")){
				//String TEMP1 = MSG.substring(3);
				//TEMP1 = TEMP1.replace("[","");
				//TEMP1 = TEMP1.replace("]","");
				
				//String[] CurrentUsers = TEMP1.split(", ");
				
				//Yuhuu.listuser.setListData(CurrentUsers);
			}else{
				Yuhuu.chat.append(MSG +"\n");	
			}
			
			
		}
	}
	
	public void SEND(String X){
		OUT.println(Yuhuu.username+ " : " + X);
		OUT.flush();
		Yuhuu.chatuser.setText("");
	}
	
}