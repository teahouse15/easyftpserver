package top.myjinji.easyftpserver.backend;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler implements Runnable {

    public Socket clientSocket;

    public BufferedInputStream bufferedInputStream;

    public BufferedOutputStream bufferedOutputStream;


    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        try {
            bufferedInputStream = new BufferedInputStream(clientSocket.getInputStream());
            bufferedOutputStream = new BufferedOutputStream(clientSocket.getOutputStream());

            bufferedOutputStream.write(new String("Hello World!").getBytes("utf-8"), 0, 12);
            bufferedOutputStream.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
