package se.liu.it3.sn.shared;
import java.io.*;
import java.net.*;
import java.util.Scanner;



/**
 * En testklient
 * @author Danne
 *
 */
public class SocketClient{
	Socket requestSocket;
	ObjectOutputStream out;
 	ObjectInputStream in;
 	String message;
 	SocketClient(){}
 	Scanner keyboard = new Scanner(System.in);
	void run()
	{
		try{
			requestSocket = new Socket("127.0.0.1", 2005);
			System.out.println("Connected to localhost in port 2005");
			out = new ObjectOutputStream(requestSocket.getOutputStream());
			out.flush();
			in = new ObjectInputStream(requestSocket.getInputStream());
			out.writeObject(new User("Adolf","hitler"));
			do{
				try{
					out.flush();
					message = (String)in.readObject();
					System.err.println("server>" + message);
					System.out.println("Skriv in lite tal för servern att räkna ut:");
					message = keyboard.nextLine();
					sendMessage(message);
				}
				catch(ClassNotFoundException classNot){
					System.err.println("data received in unknown format");
				}
			}while(!message.equals("exit"));
		}
		catch(UnknownHostException unknownHost){
			System.err.println("You are trying to connect to an unknown host!");
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
		finally{
			try{
				in.close();
				out.close();
				requestSocket.close();
			}
			catch(IOException ioException){
				ioException.printStackTrace();
			}
		}
	}
	void sendMessage(String msg)
	{
		try{
			out.writeObject(msg);
			out.flush();
			System.out.println("client>" + msg);
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		SocketClient client = new SocketClient();
		client.run();
	}
}