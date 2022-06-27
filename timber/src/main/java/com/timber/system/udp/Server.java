package com.timber.system.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {

	private DatagramSocket datagramSocket;
	private byte[] buffer = new byte[256];
	
	public Server(DatagramSocket datagramSocket) {
		this.datagramSocket = datagramSocket;
	}
	
	public void receiveClientPacket() {
		while(true) {
			try {
				DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
				datagramSocket.receive(datagramPacket);
				InetAddress inetAddress = datagramPacket.getAddress();
				int port = datagramPacket.getPort();
				String messageFromClient = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
				System.out.println("Sensor x diz: " + messageFromClient);
				datagramPacket = new DatagramPacket(buffer, buffer.length, inetAddress, port);
				datagramSocket.send(datagramPacket);
			} catch(IOException i) {
				i.printStackTrace();
				break;
			}
		}
	}
	
	public static void main(String[] args) throws SocketException {
		DatagramSocket datagramSocket = new DatagramSocket(1234);
		Server server = new Server(datagramSocket);
		server.receiveClientPacket();
	}
}
