package teste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(2020);
        Socket socket = serverSocket.accept();
        System.out.println("Cliente conectou");

        InputStreamReader inputReader = new InputStreamReader(socket.getInputStream());
        BufferedReader reader = new BufferedReader(inputReader);
        String x;
        while ((x = reader.readLine()) != null){
            System.out.println("Servidor: " + x);
        }
    }
}