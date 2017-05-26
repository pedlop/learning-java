package br.ufg.inf.dsc.cliente;

import br.ufg.inf.dsc.servidor.AtenderCliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket servidor = new Socket("localhost", 12345);
		PrintStream saidaDeDadosParaOServidor = new PrintStream(servidor.getOutputStream());
		Scanner entradaDeDadosDoServidor = new Scanner(servidor.getInputStream());
		Scanner leitor = new Scanner(System.in);
		String mensagem = "";
		while(!mensagem.equals("fim")){
			System.out.println("Digite sua mensagem para o servidor: ");
			mensagem = leitor.nextLine();
			saidaDeDadosParaOServidor.println(mensagem);
			String resposta = entradaDeDadosDoServidor.nextLine();
			System.out.println(resposta);
			if(mensagem.equals("all")){
				for (String key : AtenderCliente.carros.keySet()) {
				//for (int i = 0; i < 30; i++) {
					String result = entradaDeDadosDoServidor.nextLine();
					System.out.println(result);
				}
			}
		}
		
		
		
	}
}
