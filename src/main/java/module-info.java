module top.myjinji.easyftpserver {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens top.myjinji.easyftpserver to javafx.fxml;
    exports top.myjinji.easyftpserver.gui.controller;
    opens top.myjinji.easyftpserver.gui.controller to javafx.fxml;
    exports top.myjinji.easyftpserver.gui;
    opens top.myjinji.easyftpserver.gui to javafx.fxml;
    exports top.myjinji.easyftpserver;
    exports top.myjinji.easyftpserver.backend;
    opens top.myjinji.easyftpserver.backend to javafx.fxml;
}