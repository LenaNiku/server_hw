import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        String hostName = "localhost";
        int port = 8081;

        try (
                Socket clientSocket = new Socket(hostName, port);
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                )
        {
            out.println("text string to server from client");
        }
    }
}
