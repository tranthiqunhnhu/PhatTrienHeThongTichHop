package tuan5_RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChuyenBay extends Remote {
	public String FlightInfor(String maChuyenBay, String ngayBay, String noiDi, String noiDen, String thoiGianBay,
			int tongSoGhe, int gheDaBan, int gheTrong) throws RemoteException ;
	public float buyTicket(int soVe,double giaVe) throws RemoteException;
	public float cancelTicket(int soVe,double giaVe)throws RemoteException;
}
