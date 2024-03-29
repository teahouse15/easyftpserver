package top.myjinji.easyftpserver.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import top.myjinji.easyftpserver.Logger;

public class Starter extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Starter.class.getResource("/top/myjinji/easyftpserver/main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
        stage.show();

        Logger.info("窗口启动");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
