package top.myjinji.easyftpserver.backend;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        // 打开端口
        ServerSocket ftpServer = null;
        ftpServer = new ServerSocket(21);

        while (true) {
            Socket clientSocket = ftpServer.accept();
            ClientHandler clientHandler = new ClientHandler(clientSocket);
            new Thread(clientHandler).start();
        }
    }
}
