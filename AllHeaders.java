package IPAddress;
import java.net.*;
import java.io.*;
public class AllHeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String header = "https://facebook.com";
		for (int i=0; i < header.length(); i++) {
			 try {
			 URL u = new URL("https://facebook.com");
			 URLConnection uc = u.openConnection( );
			 for (int j = 1; ; j++) {
			 String headers = uc.getHeaderField(j);
			 if (headers == null) break;
			 System.out.println(uc.getHeaderFieldKey(j) + ": " + headers);
			 }
			 }
			 catch (MalformedURLException ex) {
			 System.err.println(args[i] + " is not a URL I understand.");
			 }
			 catch (IOException ex) {
			 System.err.println(ex);
			 }
			 System.out.println( );
		}
	}
}
