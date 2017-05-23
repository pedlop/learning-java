package br.ufg.inf.dsc.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorCarro {


	
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		
		while(true){
			Socket cliente = servidor.accept();
			System.out.println(cliente.getInetAddress().getHostAddress());
			Thread t = new Thread(new AtenderCliente(cliente));
			t.start();
			
		}
	}

}
