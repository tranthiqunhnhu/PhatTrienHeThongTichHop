package bai5;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class Server1 {
	public static void main(String[] args) throws IOException{
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("Server da duoc tao");
			Socket client = server.accept();
			System.out.println("Client da ket noi den server");
			Scanner inFromClient = new Scanner(client.getInputStream());
			PrintStream outToClient = new PrintStream(client.getOutputStream());
			outToClient.println("Moi ban nhap mot so 0-9:");
			int a = inFromClient.nextInt();
			if(a>=0 && a<=9)
			{
				switch (a) {
				case 0: {
					outToClient.print("khong");
					break;
				}
				case 1: {
					outToClient.print("mot");
					break;
				}
				case 2: {
					outToClient.print("hai");
					break;
				}
				case 3: {
					outToClient.print("ba");
					break;
				}
				case 4: {
					outToClient.print("bon");
					break;
				}
				case 5: {
					outToClient.print("nam");
					break;
				}
				case 6: {
					outToClient.print("sau");
					break;
				}
				case 7: {
					outToClient.print("bay");
					break;
				}
				case 8: {
					outToClient.print("tam");
					break;
				}
				case 9: {
					outToClient.print("chin");
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + a);
				}
			}else
			{
				outToClient.println("So phai nam trong khoang 0 den 9!!!");
			}
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		}
}
