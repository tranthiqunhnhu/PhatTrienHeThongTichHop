package IPAddress;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
public class viewSource {
	public static void main(String[] args) {
		{
			URL u;
			String thisLine;
			try{
			u = new URL("https://www.youtube.com/");
			try{
			BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream())); //thay the cho DataInputStream
			while((thisLine = br.readLine())!= null)
				System.out.println(thisLine);
				}
					catch(IOException e)
				{
					System.err.println(e);
				}
			}
				catch(MalformedURLException e){
				System.err.println(e);
				}
			}
		}
	}

