package top.myjinji.easyftpserver.backend;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    public static void main(String[] args) {
        // 打开端口
        ServerSocket ftpServer = null;
        try {
            ftpServer = new ServerSocket(21);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
