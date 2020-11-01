package tuan5_RMI;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		// TODO Auto-generated method stub
		/*Dang ky server*/
		try {
			Registry reg= LocateRegistry.createRegistry(7777);
			PhuongThucChuyenBay f=new PhuongThucChuyenBay();
			reg.bind("RMICalSer", f);
			System.out.println("Rất vui được phục vụ quý khách");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
