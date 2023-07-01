package teste;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 2020);
        Scanner scanner = new Scanner(System.in);

        ClienteThread clienteThread = new ClienteThread(socket);
        clienteThread.start();
        PrintStream saida = new PrintStream(socket.getOutputStream());
        String teclado = scanner.nextLine();
        saida.println(teclado);

    }
}
