package br.ufg.inf.dsc.cliente;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by pedro on 23/05/2017.
 */
public class ReceberMensagem implements Runnable {

    private Socket servidor;

    public ReceberMensagem(Socket servidor) {
        this.servidor = servidor;

    }

    public void run() {
        try {
            Scanner ouvirServidor = new Scanner(servidor.getInputStream());
            do {
                String mensagem = ouvirServidor.nextLine();
                System.out.println(mensagem);
            } while (true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
