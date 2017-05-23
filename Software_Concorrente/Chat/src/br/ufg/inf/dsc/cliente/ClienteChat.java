package br.ufg.inf.dsc.cliente;

import java.net.UnknownHostException;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by pedro on 23/05/2017.
 */
public class ClienteChat {

    public static void main(String[] args) throws UnknownHostException, IOException {

        Socket servidor = new Socket("127.0.0.1", 12345);
        new Thread(new EnviarMensagem(servidor)).start();
        new Thread(new ReceberMensagem(servidor)).start();

    }
}
