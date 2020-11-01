package tuan5_RMI;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
public class Client {
	public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException{
		Registry reg = LocateRegistry.getRegistry("localhost", 7777);
		PhuongThucChuyenBay flight=(PhuongThucChuyenBay)reg.lookup("RMICalSer");
		/*xem thong tin chuyen bay*/
		System.out.println("THÔNG TIN CHUYẾN BAY\n");
		System.out.println("Chuyến bay 1(A01)\n");
		String infor01=flight.FlightInfor("A01", "8h 09-11-2020", "TpHCM", "HaNoi", "2h15p", 126, 87, 39);
		System.out.println(infor01);
		System.out.println("Chuyến bay 1(A02)\n");
		String infor02=flight.FlightInfor("A02", "12h 09-11-2020", "TpHCM", "HaNoi", "2h15p", 126, 90, 36);
		System.out.println(infor02);
		System.out.println("Chuyến bay 1(A03)\n");
		String infor03=flight.FlightInfor("A02", "16h 09-11-2020", "TpHCM", "HaNoi", "2h15p", 126, 50, 76);
		System.out.println(infor03);
		float gia;
		int chon;
		System.out.println("Mời bạn chọn dịch vụ:\n 1.Mua vé\n 2.Trả vé\n");
		Scanner c = new Scanner(System.in);
		chon=c.nextInt();
		if(chon==1)
		{
			int ghe;
			System.out.println("Mời bạn chọn loại ghế:\n 1.Ghế thường(1.378.000VND)\n 2.Ghế vip(1.778.000VND)\n");
			ghe=c.nextInt();
			if(ghe==1)
			{
				System.out.println("Mời bạn nhập số vé muốn mua: ");
				int soVe=c.nextInt();
				gia=flight.buyTicket(soVe, 1378000);
			}
			else
			{
				System.out.println("Mời bạn nhập số vé muốn mua: ");
				int soVe=c.nextInt();
				gia=flight.buyTicket(soVe, 1778000);
			}
			System.out.println("Số tiền phải thanh toán là: "+gia+" VND");
		}
		else
			{
				int ghe;
				System.out.println("Mời bạn chọn loại ghế:\n 1.Ghế thường(1.378.000VND)\n 2.Ghế vip(1.778.000VND)\n");
				ghe=c.nextInt();
				if(ghe==1)
				{
					System.out.println("Mời bạn nhập số vé muốn trả: ");
					int soVe=c.nextInt();
					gia=flight.cancelTicket(soVe, 1378000);
				}
				else
				{
					System.out.println("Mời bạn nhập số vé muốn trả: ");
					int soVe=c.nextInt();
					gia=flight.cancelTicket(soVe, 1778000);
				}
				System.out.println("Số tiền được hoàn trả là: "+gia+" VND\n");
				System.out.println("Số tiền sẽ được hoàn trả sau 12-24h sau khi gửi thông báo trả vé");
			}
	}

}
