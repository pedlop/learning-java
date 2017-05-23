package br.ufg.inf.dsc.cliente;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by pedro on 23/05/2017.
 */
public class EnviarMensagem implements Runnable {
    private Socket servidor;

    public EnviarMensagem(Socket servidor) {
        this.servidor = servidor;
    }

    @Override
    public void run() {
        try {
            Scanner leitor = new Scanner(System.in);
            PrintWriter saidaServidor = new PrintWriter(this.servidor.getOutputStream());
            do {
                String texto = leitor.nextLine();
                saidaServidor.println("Pedro" + texto);
            } while (true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
