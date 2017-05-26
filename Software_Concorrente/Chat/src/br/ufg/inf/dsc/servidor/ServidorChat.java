package br.ufg.inf.dsc.servidor;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pedro on 23/05/2017.
 */

public class ServidorChat {

	private static List<Socket> clientes = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Servidor conectado");

		do{
			Socket cli = servidor.accept();
			System.out.println(cli.getInetAddress().getHostAddress());
			clientes.add(cli);
			new Thread(new AtenderCliente(cli)).start();
		}while (true);

	}

	public static void distribuirMensagem(String mensagem, Socket cli) throws IOException {
		System.out.println(mensagem);
		for (Socket c : clientes) {
			if (!(c.equals(cli))){
				PrintWriter pw = new PrintWriter(c.getOutputStream(),true);
				pw.println(mensagem);
			}
		}
	}

	public static void remover(Socket cli){

		clientes.remove(cli);
	}

}
