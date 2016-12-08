import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
public static void main(String[] args) throws IOException{
	try (Socket s = new Socket("172.16.127.73", 9091)){
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
	String response = "";
	String request = "";
	
	for (int i=0; i < 3; i++){
		response = in.readLine();
		System.out.println(response);
			}
	while(true){
		System.out.print(">> ");
		request = cin.readLine();
		out.println(request);
		
		response = in.readLine();
		if(response == null || response.equals("")) break;
		System.out.println(response);
			}
	System.out.println("Connection closed.");
		}
	}
}
